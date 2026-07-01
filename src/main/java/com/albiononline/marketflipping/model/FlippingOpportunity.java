package com.albiononline.marketflipping.model;

public record FlippingOpportunity(Equipment equipment,Quality quality,City from,City to,int buyPrice,int sellPrice) {
	
}
