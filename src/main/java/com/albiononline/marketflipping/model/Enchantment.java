package com.albiononline.marketflipping.model;

import java.util.Arrays;

public enum Enchantment {
	NONE("", ".0"),
	ENCH_1("@1", ".1"),
	ENCH_2("@2", ".2"),
	ENCH_3("@3", ".3"),
	ENCH_4("@4", ".4"),
	;
	
    private final String codeName;
    private final String displayName;
    private Enchantment(String codeName, String displayName) {
        this.codeName = codeName;
        this.displayName = displayName;
    }
    
    public String getCodeName() {
    	return codeName;
    }
    
    public String getDisplayName() {
    	return displayName;
    }
}
