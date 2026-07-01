package com.albiononline.marketflipping.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Quality {
	NORMAL(1),
	GOOD(2),
	OUTSTANDING(3),
	EXCELENT(4),
	MASTERPIECE(5),
	;
	
    private final int codeName;
    private Quality(int codeName) {
        this.codeName = codeName;
    }
    
    public int getCodeName() {
    	return codeName;
    }
    
    @JsonCreator
    public static Quality fromValue(int codeName) {
        for (Quality quality : Quality.values()) {
            if (quality.getCodeName() == codeName) {
                return quality;
            }
        }
        throw new IllegalArgumentException("Unknown quality value: " + codeName);
    }
}
