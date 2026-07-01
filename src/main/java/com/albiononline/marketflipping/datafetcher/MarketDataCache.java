package com.albiononline.marketflipping.datafetcher;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.albiononline.marketflipping.model.Equipment;
import com.albiononline.marketflipping.model.MarketData;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import lombok.NonNull;

public final class MarketDataCache {
	
    private final Cache<Equipment, List<MarketData>> cache;

    public MarketDataCache() {
        this.cache = Caffeine.newBuilder()
                .expireAfterWrite(Duration.ofMinutes(40))
                .maximumSize(1_000_000)
                .build();
    }

	protected @NonNull Map<Equipment, List<MarketData>> fetchMarketDataOfEquipments(List<Equipment> equipments) {
        return equipments.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        equipment -> cache.getIfPresent(equipment) == null
                                ? List.of()
                                : cache.getIfPresent(equipment)
                ));
	}
    
    public void putAll(Map<Equipment, List<MarketData>> values) {
        cache.putAll(values);
    }
}
