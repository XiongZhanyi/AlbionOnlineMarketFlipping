package com.albiononline.marketflipping.model.armor;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum LeatherJacket implements EquipmentType {
    MERCENARY_JACKET("ARMOR_LEATHER_SET1", "Mercenary Jacket"),
    HUNTER_JACKET("ARMOR_LEATHER_SET2", "Hunter Jacket"),
    ASSASSIN_JACKET("ARMOR_LEATHER_SET3", "Assassin Jacket"),
    STALKER_JACKET("ARMOR_LEATHER_MORGANA", "Stalker Jacket"),
    HELLION_JACKET("ARMOR_LEATHER_HELL", "Hellion Jacket"),
    SPECTER_JACKET("ARMOR_LEATHER_UNDEAD", "Specter Jacket"),
    MISTWALKER_JACKET("ARMOR_LEATHER_FEY", "Mistwalker Jacket"),
    JACKET_OF_TENACITY("ARMOR_LEATHER_AVALON", "Jacket of Tenacity"),
    ROYAL_JACKET("ARMOR_LEATHER_ROYAL", "Royal Jacket");
	
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
