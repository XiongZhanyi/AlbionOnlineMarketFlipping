package com.albiononline.marketflipping.model.armor;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum LeatherShoes implements EquipmentType{
    MERCENARY_SHOES("SHOES_LEATHER_SET1", "Mercenary Shoes"),
    HUNTER_SHOES("SHOES_LEATHER_SET2", "Hunter Shoes"),
    ASSASSIN_SHOES("SHOES_LEATHER_SET3", "Assassin Shoes"),
    STALKER_SHOES("SHOES_LEATHER_MORGANA", "Stalker Shoes"),
    HELLION_SHOES("SHOES_LEATHER_HELL", "Hellion Shoes"),
    SPECTER_SHOES("SHOES_LEATHER_UNDEAD", "Specter Shoes"),
    MISTWALKER_SHOES("SHOES_LEATHER_FEY", "Mistwalker Shoes"),
    SHOES_OF_TENACITY("SHOES_LEATHER_AVALON", "Shoes of Tenacity"),
    ROYAL_SHOES("SHOES_LEATHER_ROYAL", "Royal Shoes");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
