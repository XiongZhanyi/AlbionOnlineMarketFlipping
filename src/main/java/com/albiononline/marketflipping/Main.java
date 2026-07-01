package com.albiononline.marketflipping;

import java.util.List;

import com.albiononline.marketflipping.datafetcher.MarketDataService;
import com.albiononline.marketflipping.model.FlippingOpportunity;

public class Main {
	public static void main(String[] args) {
		long start1 = System.nanoTime();
		MarketDataService dataService = new MarketDataService();
		long elapsedMs = (System.nanoTime() - start1) / 1_000_000;
		System.out.println("dataService took " + elapsedMs + " ms");
	}
}
