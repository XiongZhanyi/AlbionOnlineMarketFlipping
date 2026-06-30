package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TorchFighter implements EquipmentType {
    TORCH("OFF_TORCH", "Torch"),
    MISTCALLER("OFF_HORN_KEEPER", "Mistcaller"),
    LEERING_CANE("OFF_JESTERCANE_HELL", "Leering Cane"),
    CRYPTCANDLE("OFF_LAMP_UNDEAD", "Cryptcandle"),
    SACRED_SCEPTER("OFF_TALISMAN_AVALON", "Sacred Scepter");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
