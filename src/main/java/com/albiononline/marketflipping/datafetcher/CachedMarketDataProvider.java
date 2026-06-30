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

public final class CachedMarketDataProvider extends MarketDataProvider {
	
    private final MarketDataProvider delegate;
    private final Cache<Equipment, List<MarketData>> cache;

    public CachedMarketDataProvider(MarketDataProvider delegate) {
        this.delegate = delegate;
        this.cache = Caffeine.newBuilder()
            .expireAfterWrite(Duration.ofMinutes(30))
            .maximumSize(1000000)
            .build();
    }

	@Override
	protected @NonNull Map<Equipment, List<MarketData>> fetchMarketDataOfEquipments(List<Equipment> equipments) {
        List<Equipment> equipmentsMissingMarketData = equipments.stream()
                .filter(e -> cache.getIfPresent(e) == null)
                .toList();

        if (!equipmentsMissingMarketData.isEmpty()) {
            cache.putAll(delegate.fetchMarketDataOfEquipments(equipmentsMissingMarketData));
        }
        
        return equipments.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        equipment -> cache.getIfPresent(equipment)
                ));
	}
}
