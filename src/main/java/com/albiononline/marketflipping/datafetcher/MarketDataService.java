package com.albiononline.marketflipping.datafetcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.albiononline.marketflipping.model.Enchantment;
import com.albiononline.marketflipping.model.Equipment;
import com.albiononline.marketflipping.model.EquipmentType;
import com.albiononline.marketflipping.model.EquipmentTypeWrapper;
import com.albiononline.marketflipping.model.MarketData;
import com.albiononline.marketflipping.model.Tier;

import lombok.NonNull;

public class MarketDataService {
	private @NonNull EquipmentTypeWrapper equipmentTypeWrapper = new EquipmentTypeWrapper();
	private @NonNull MarketDataProvider marketDataProvider = new CachedMarketDataProvider(new AlbionAPIMarketDataProvider());
	
	public void findFlippingOportunity() {
		Map<Equipment, List<MarketData>> marketDataOfEquipment = marketDataProvider.fetchMarketDataOfEquipments(buildAllEquipment());
		
		// Do things with the data
	}
	
	private @NonNull List<Equipment> buildAllEquipment(){
		List<Equipment> equipment = new ArrayList<>();
		for(Tier tier : List.of(Tier.values())) {
			for(Enchantment enchantment : List.of(Enchantment.values())) {
				for(EquipmentType equipmentType : equipmentTypeWrapper.retrieveAllEquipments()) {
					equipment.add(new Equipment(equipmentType, tier, enchantment));
				}
			}
		}
		return equipment;
	}
}
