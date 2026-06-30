package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Shield implements EquipmentType {
    SHIELD("OFF_SHIELD", "Shield"),
    SARCOPHAGUS("OFF_TOWERSHIELD_UNDEAD", "Sarcophagus"),
    CAITIFF_SHIELD("OFF_SHIELD_HELL", "Caitiff Shield"),
    FACEBREAKER("OFF_SPIKEDSHIELD_MORGANA", "Facebreaker"),
    ASTRAL_AEGIS("OFF_SHIELD_AVALON", "Astral Aegis");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
