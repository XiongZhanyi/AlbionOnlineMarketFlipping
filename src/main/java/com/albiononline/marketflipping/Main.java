package com.albiononline.marketflipping;

import com.albiononline.marketflipping.datafetcher.MarketDataService;

public class Main {
	public static void main(String[] args) {
		MarketDataService dataService = new MarketDataService();
		
		dataService.findFlippingOportunity();
	}
}
