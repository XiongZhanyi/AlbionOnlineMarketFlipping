package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Dagger implements EquipmentType {
    DAGGER("MAIN_DAGGER", "Dagger"),
    DAGGER_PAIR("2H_DAGGERPAIR", "Dagger Pair"),
    CLAWS("2H_CLAWPAIR", "Claws"),
    BLOODLETTER("MAIN_RAPIER_MORGANA", "Bloodletter"),
    DEMONFANG("MAIN_DAGGER_HELL", "Demonfang"),
    DEATHGIVERS("2H_DUALSICKLE_UNDEAD" , "Deathgivers"),
    BRIDLED_FURY("2H_DAGGER_KATAR_AVALON", "Bridled Fury"),
	TWIN_SLAYER("2H_DAGGERPAIR_CRYSTAL", "Twin Slayer");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
