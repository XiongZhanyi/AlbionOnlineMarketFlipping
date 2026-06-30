package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TomeFighter implements EquipmentType {
    TOME_OF_SPELLS("OFF_BOOK", "Tome of Spells"),
    EYE_OF_SECRETS("OFF_ORB_MORGANA", "Eye of Secrets"),
    MUISAK("OFF_DEMONSKULL_HELL", "Muisak"),
    TAPROOT("OFF_TOTEM_KEEPER", "Taproot"),
    CELESTIAL_CENSER("OFF_CENSER_AVALON", "Celestial Censer");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
