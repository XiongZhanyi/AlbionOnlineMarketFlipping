package com.albiononline.marketflipping.model;

public enum Quality {
	NORMAL(1),
	GOOD(2),
	OUTSTANDING(3),
	EXCELENT(4),
	MASTERPIECE(5),
	;
	
    private final int albionOnlineDataProject;
    private Quality(int albionOnlineDataProject) {
        this.albionOnlineDataProject = albionOnlineDataProject;
    }
    
    public int getAlbionOnlineDataProject() {
    	return albionOnlineDataProject;
    }
}
