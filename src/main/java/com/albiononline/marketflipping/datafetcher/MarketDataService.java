package com.albiononline.marketflipping.datafetcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.albiononline.marketflipping.model.Enchantment;
import com.albiononline.marketflipping.model.Equipment;
import com.albiononline.marketflipping.model.EquipmentType;
import com.albiononline.marketflipping.model.EquipmentTypeWrapper;
import com.albiononline.marketflipping.model.FlippingOpportunity;
import com.albiononline.marketflipping.model.MarketData;
import com.albiononline.marketflipping.model.Quality;
import com.albiononline.marketflipping.model.Tier;

import lombok.NonNull;

// @Service
public class MarketDataService {
	private @NonNull EquipmentTypeWrapper equipmentTypeWrapper;
	private @NonNull MarketDataCache marketDataCache;
	private @NonNull MarketDataRefreshService dataRefreshService;
	
	public MarketDataService() {
	    this.equipmentTypeWrapper = new EquipmentTypeWrapper();

	    List<Equipment> allEquipment = buildAllEquipment();

	    this.marketDataCache = new MarketDataCache();
	    dataRefreshService = new MarketDataRefreshService(new AlbionAPIMarketDataProvider(), marketDataCache);
	    dataRefreshService.start(allEquipment);
	}
	
	public List<FlippingOpportunity> findFlippingOpportunity() {
	    Map<Equipment, List<MarketData>> marketDataOfEquipment = 
	    		marketDataCache.fetchMarketDataOfEquipments(buildAllEquipment());
	    
	    return marketDataOfEquipment.entrySet().parallelStream()
	        .flatMap(entry -> processEquipment(entry.getKey(), entry.getValue()).stream())
	        .collect(Collectors.toList());
	}

	private List<FlippingOpportunity> processEquipment(Equipment equipment, List<MarketData> marketDataList) {
	    Map<Quality, List<MarketData>> marketDataByQuality = marketDataList.stream()
	        .collect(Collectors.groupingBy(MarketData::getQuality));
	    
	    List<FlippingOpportunity> opportunities = new ArrayList<>();
	    
	    for (List<MarketData> sameQualityData : marketDataByQuality.values()) {
	        opportunities.addAll(findOpportunitiesForQuality(equipment, sameQualityData));
	    }
	    
	    return opportunities;
	}
	
	private List<FlippingOpportunity> findOpportunitiesForQuality(Equipment equipment, List<MarketData> marketDataList) {
	    List<FlippingOpportunity> opportunities = new ArrayList<>();
	    
	    List<MarketData> validData = marketDataList.stream()
	        .filter(d -> d.getSellPriceMin() > 0 && d.getBuyPriceMin() > 0)
	        .collect(Collectors.toList());
	    
	    if (validData.size() < 2) return opportunities;
	    
	    List<MarketData> sortedBySell = validData.stream()
	        .sorted(Comparator.comparing(MarketData::getSellPriceMin))
	        .collect(Collectors.toList());
	    
	    List<MarketData> sortedByBuy = validData.stream()
	        .sorted(Comparator.comparing(MarketData::getBuyPriceMin).reversed())
	        .collect(Collectors.toList());
	    
	    for (MarketData sellData : sortedBySell) {
	        for (MarketData buyData : sortedByBuy) {
	            if (sellData.getCity().equals(buyData.getCity())) continue;
	            
	            if (sellData.getSellPriceMin() < buyData.getBuyPriceMin()) {
	                opportunities.add(new FlippingOpportunity(
	                    equipment, 
	                    sellData.getQuality(),
	                    sellData.getCity(), 
	                    buyData.getCity(), 
	                    sellData.getSellPriceMin(), 
	                    buyData.getBuyPriceMin(),
	                    sellData.getSellPriceMinDate().isAfter(buyData.getBuyPriceMinDate()) ? buyData.getBuyPriceMinDate() : sellData.getSellPriceMinDate()   
	                ));
	            } else {
	                break;
	            }
	        }
	    }
	    
	    return opportunities;
	}
	
	private @NonNull List<Equipment> buildAllEquipment(){
	    List<EquipmentType> types = equipmentTypeWrapper.retrieveAllEquipments();
	    
	    List<Equipment> equipments = Arrays.stream(Tier.values())
	        .parallel()
	        .flatMap(tier -> Arrays.stream(Enchantment.values())
	            .flatMap(enchantment -> types.stream()
	                .map(type -> new Equipment(type, tier, enchantment))
	            )
	        )
	        .collect(Collectors.toList());
	    
	    return equipments;
	}
}
