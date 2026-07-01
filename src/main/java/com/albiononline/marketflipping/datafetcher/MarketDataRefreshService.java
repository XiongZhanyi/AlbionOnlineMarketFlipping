package com.albiononline.marketflipping.datafetcher;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import com.albiononline.marketflipping.model.Equipment;

public final class MarketDataRefreshService implements AutoCloseable {
    private final MarketDataCache cache;
    private final MarketDataProvider delegate;
    private final ScheduledExecutorService scheduler;
    private final AtomicBoolean refreshInProgress = new AtomicBoolean(false);

    public MarketDataRefreshService(MarketDataProvider delegate, MarketDataCache cache) {
        this.delegate = delegate;
        this.cache = cache;
        this.scheduler = Executors.newSingleThreadScheduledExecutor();;
    }

    public void start(List<Equipment> equipments) {
        refresh(equipments);

        scheduler.scheduleWithFixedDelay(
                () -> refresh(equipments),
                30,
                30,
                TimeUnit.MINUTES
        );
    }

    private void refresh(List<Equipment> equipments) {
        if (!refreshInProgress.compareAndSet(false, true)) {
            return;
        }

        try {
        	cache.putAll(delegate.fetchMarketDataOfEquipments(equipments));
        } finally {
            refreshInProgress.set(false);
        }
    }

    @Override
    public void close() {
        scheduler.shutdown();
    }
}
