package com.albiononline.marketflipping.datafetcher;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.zip.GZIPInputStream;

import com.albiononline.marketflipping.model.Equipment;
import com.albiononline.marketflipping.model.MarketData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import lombok.NonNull;

public final class AlbionAPIMarketDataProvider extends MarketDataProvider {
	private static final String API_URL = "https://europe.albion-online-data.com/api/v2/stats/prices/%s.json";
	private static final int MAXIMUM_URL_LENGTH = 4096;
    private final HttpClient client = HttpClient.newHttpClient();
    private final JsonMapper objectMapper = new JsonMapper();

    public AlbionAPIMarketDataProvider() {
    	objectMapper.registerModule(new JavaTimeModule());
    }

    protected @NonNull Map<Equipment, List<MarketData>> fetchMarketDataOfEquipments(@NonNull List<Equipment> equipments) {
    	List<MarketData> data = new ArrayList<MarketData>();
    	
    	// Time when fetching data starts
    	long start = System.nanoTime();
    	
    	for (String url : buildURLsForEquipments(equipments)) {
    	    HttpRequest request = HttpRequest.newBuilder()
    	            .uri(URI.create(url))
    	            .header("Accept-Encoding", "gzip")
    	            .header("Accept", "application/json")
    	            .GET()
    	            .build();

    	    try {
    	        HttpResponse<InputStream> response =
    	                client.send(request, HttpResponse.BodyHandlers.ofInputStream());

    	        InputStream body = response.body();

    	        if ("gzip".equalsIgnoreCase(
    	                response.headers().firstValue("Content-Encoding").orElse(""))) {
    	            body = new GZIPInputStream(body);
    	        }

    	        String responseBody = new String(body.readAllBytes(), StandardCharsets.UTF_8);

//    	        System.out.println("URL: " + url);
//    	        System.out.println("Status: " + response.statusCode());
//    	        System.out.println("Content-Type: " +
//    	                response.headers().firstValue("Content-Type").orElse("unknown"));
//    	        System.out.println("Body starts with: " +
//    	                responseBody.substring(0, Math.min(300, responseBody.length())));
//
//    	        if (response.statusCode() != 200) {
//    	            throw new IOException("Request failed with status " + response.statusCode());
//    	        }
//
//    	        if (!responseBody.trim().startsWith("[") && !responseBody.trim().startsWith("{")) {
//    	            throw new IOException("Response is not JSON");
//    	        }

    	        data.addAll(objectMapper.readValue(
    	                responseBody,
    	                new TypeReference<List<MarketData>>() {}
    	        ));

    	    } catch (IOException | InterruptedException e) {
    	        System.out.println(e);
    	    }
    	}
    	
    	long elapsedMs = (System.nanoTime() - start) / 1_000_000;
    	System.out.println("fetchMarketDataOfEquipments took " + elapsedMs + " ms");
    	
    	return equipments.stream()
    		    .collect(Collectors.toMap(
    		        Function.identity(),
    		        equipment -> data.stream()
    		            .filter(marketData -> marketData.getItemId().equals(equipment.getCodeName()))
    		            .collect(Collectors.toList())
    		    ));
    }
    
    private @NonNull List<String> buildURLsForEquipments(@NonNull List<Equipment> equipments) {
        return buildBatches(equipments.stream()
                .map(Equipment::getCodeName)
                .collect(Collectors.toList()));
    }

    private List<String> buildBatches(List<String> codes) {
        List<String> batches = new ArrayList<>();
        StringBuilder currentBatch = new StringBuilder();
        
        for (String code : codes) {
            if (!currentBatch.isEmpty() && currentBatch.length() + code.length() > MAXIMUM_URL_LENGTH-API_URL.length()) {
                batches.add(API_URL.formatted(currentBatch));
                currentBatch.setLength(0);
            }
            
            if (!currentBatch.isEmpty()) {
            	currentBatch.append(',');
            }
            currentBatch.append(code);
        }
        
        if (!currentBatch.isEmpty()) {
            batches.add(API_URL.formatted(currentBatch));
        }
        
        return batches;
    }
}
