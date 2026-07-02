package com.albiononline.marketflipping.datafetcher;

import java.util.List;
import java.util.Map;

import com.albiononline.marketflipping.model.Equipment;
import com.albiononline.marketflipping.model.MarketData;

import lombok.NonNull;

abstract sealed class MarketDataProvider
	permits AlbionAPIMarketDataProvider {

	protected abstract @NonNull Map<Equipment, List<MarketData>> fetchMarketDataOfEquipments(@NonNull List<Equipment> equipments) ;

}
