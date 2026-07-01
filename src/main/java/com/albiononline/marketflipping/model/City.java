package com.albiononline.marketflipping.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum City {
    THETFORD("Thetford"),
    FORT_STERLING("Fort Sterling"),
    LYNHURST("Lymhurst"),
    BRIDGEWATCH("Bridgewatch"),
    MARTLOCK("Martlock"),
    CAERLEON("Caerleon"),
    BRECILIEN("Brecilien"),
	BLACK_MARKET("Black Market");

    private final String displayName;

    City(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
    
    
    @JsonCreator
    public static City fromDisplayName(String displayName) {
        for (City city : values()) {
            if(city.getDisplayName().equals(displayName)) {
            	return city;
            }
        }
        throw new IllegalArgumentException("Unknown city: " + displayName);
    }

    @JsonValue
    public String toDisplayName() {
        return displayName;
    }
}
