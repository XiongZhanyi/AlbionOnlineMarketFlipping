package com.albiononline.marketflipping.model;

import java.time.Instant;

public record FlippingOpportunity(Equipment equipment,Quality quality,City from,City to,int buyPrice,int sellPrice,Instant dateTime) {
	
}
