package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum FrostMage implements EquipmentType {
    FROST_STAFF("MAIN_FROSTSTAFF", "Frost Staff"),
    GREAT_FROST_STAFF("2H_FROSTSTAFF", "Great Frost Staff"),
    GLACIAL_STAFF("2H_GLACIALSTAFF", "Glacial Staff"),
    HOARFROST_STAFF("MAIN_FROSTSTAFF_KEEPER", "Hoarfrost Staff"),
    ICICLE_STAFF("2H_ICEGAUNTLETS_HELL", "Icicle Staff"),
    PERMAFROST_PRISM("2H_ICECRYSTAL_UNDEAD", "Permafrost Prism"),
    CHILLHOWL("MAIN_FROSTSTAFF_AVALON", "Chillhowl");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
