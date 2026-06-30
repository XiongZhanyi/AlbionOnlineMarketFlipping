package com.albiononline.marketflipping.model.armor;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum LeatherHood implements EquipmentType {
    MERCENARY_HOOD("HEAD_LEATHER_SET1", "Mercenary Hood"),
    HUNTER_HOOD("HEAD_LEATHER_SET2", "Hunter Hood"),
    ASSASSIN_HOOD("HEAD_LEATHER_SET3", "Assassin Hood"),
    STALKER_HOOD("HEAD_LEATHER_MORGANA", "Stalker Hood"),
    HELLION_HOOD("HEAD_LEATHER_HELL", "Hellion Hood"),
    SPECTER_HOOD("HEAD_LEATHER_UNDEAD", "Specter Hood"),
    MISTWALKER_HOOD("HEAD_LEATHER_FEY", "Mistwalker Hood"),
    HOOD_OF_TENACITY("HEAD_LEATHER_AVALON", "Hood of Tenacity"),
    ROYAL_HOOD("HEAD_LEATHER_ROYAL", "Royal Hood");

    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
