package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Spear implements EquipmentType {
    SPEAR("MAIN_SPEAR", "Spear"),
    PIKE("2H_SPEAR", "Pike"),
    GLAIVE("2H_GLAIVE", "Glaive"),
    HERON_SPEAR("MAIN_SPEAR_KEEPER", "Heron Spear"),
    SPIRITHUNTER("2H_HARPOON_HELL", "Spirithunter"),
    TRINITY_SPEAR("2H_TRIDENT_UNDEAD", "Trinity Spear"),
    DAYBREAKER("MAIN_SPEAR_LANCE_AVALON", "Daybreaker"),
    RIFT_GLAIVE("2H_GLAIVE_CRYSTAL", "Rift Glaive");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
