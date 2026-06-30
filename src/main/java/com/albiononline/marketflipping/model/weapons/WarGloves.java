package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum WarGloves implements EquipmentType {
    BRAWLER_GLOVES("2H_KNUCKLES_SET1", "Brawler Gloves"),
    BATTLE_BRACERS("2H_KNUCKLES_SET2", "Battle Bracers"),
    SPIKED_GAUNTLETS("2H_KNUCKLES_SET3", "Spiked Gauntlets"),
    URSINE_MAULERS("2H_KNUCKLES_KEEPER", "Ursine Maulers"),
    HELLFIRE_HANDS("2H_KNUCKLES_HELL", "Hellfire Hands"),
    RAVENSTRIKE_CESTUS("2H_KNUCKLES_MORGANA", "Ravenstrike Cestus"),
    FISTS_OF_AVALON("2H_KNUCKLES_AVALON", "Fists of Avalon");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
