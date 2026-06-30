package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Hammer implements EquipmentType {
    HAMMER("MAIN_HAMMER", "Hammer"),
    POLEHAMMER("2H_POLEHAMMER", "Polehammer"),
    GREAT_HAMMER("2H_HAMMER", "Great Hammer"),
    TOMBHAMMER("2H_HAMMER_UNDEAD", "Tombhammer"),
    FORGE_HAMMERS("2H_DUALHAMMER_HELL", "Forge Hammers"),
    GROVEKEEPER("2H_RAM_KEEPER", "Grovekeeper"),
    HAND_OF_JUSTICE("2H_HAMMER_AVALON", "Hand of Justice");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
