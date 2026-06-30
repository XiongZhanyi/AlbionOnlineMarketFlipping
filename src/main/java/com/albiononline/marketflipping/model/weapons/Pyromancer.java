package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Pyromancer implements EquipmentType {
    FIRE_STAFF("MAIN_FIRESTAFF", "Fire Staff"),
    GREAT_FIRE_STAFF("2H_FIRESTAFF", "Great Fire Staff"),
    INFERNAL_STAFF("2H_INFERNOSTAFF", "Infernal Staff"),
    WILDFIRE_STAFF("MAIN_FIRESTAFF_KEEPER", "Wildfire Staff"),
    BRIMSTONE_STAFF("2H_FIRESTAFF_HELL", "Brimstone Staff"),
    BLAZING_STAFF("2H_INFERNOSTAFF_MORGANA", "Blazing Staff"),
    DAWNSONG("2H_FIRE_RINGPAIR_AVALON", "Dawnsong");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
