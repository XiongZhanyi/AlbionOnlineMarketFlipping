package com.albiononline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.albiononline.marketflipping.datafetcher.MarketDataService;

import lombok.NonNull;

@Controller
public class MarketFlippingController {
	// private final @NonNull MarketDataService marketDataService;
	
    public MarketFlippingController() {
    	// @NonNull MarketDataService marketDataService
        // this.marketDataService = marketDataService;
    }
    
    @GetMapping("/")
    public String home(Model model) {
//        model.addAttribute("opportunities", marketDataService.findFlippingOpportunity());
        return "index";
    }
}
