package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Crossbow implements EquipmentType {
    CROSSBOW("2H_CROSSBOW", "Crossbow"),
    HEAVY_CROSSBOW("2H_CROSSBOWLARGE", "Heavy Crossbow"),
    LIGHT_CROSSBOW("MAIN_1HCROSSBOW", "Light Crossbow"),
    WEEPING_REPEATER("2H_REPEATINGCROSSBOW_UNDEAD", "Weeping Repeater"),
    BOLTCASTERS("2H_DUALCROSSBOW_HELL", "Boltcasters"),
    SIEGEBOW("2H_CROSSBOWLARGE_MORGANA", "Siegebow"),
    ENERGY_SHAPER("2H_CROSSBOW_CANNON_AVALON", "Energy Shaper");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
