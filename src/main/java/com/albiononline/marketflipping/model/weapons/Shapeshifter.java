package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Shapeshifter implements EquipmentType {
    PROWLING_STAFF("2H_SHAPESHIFTER_SET1", "Prowling Staff"),
    ROOTBOUND_STAFF("2H_SHAPESHIFTER_SET2", "Rootbound Staff"),
    PRIMAL_STAFF("2H_SHAPESHIFTER_SET3", "Primal Staff"),
    BLOODMOON_STAFF("2H_SHAPESHIFTER_MORGANA", "Bloodmoon Staff"),
    HELLSPAWN_STAFF("2H_SHAPESHIFTER_HELL", "Hellspawn Staff"),
    EARTHRUNE_STAFF("2H_SHAPESHIFTER_KEEPER", "Earthrune Staff"),
    LIGHTCALLER("2H_SHAPESHIFTER_AVALON", "Lightcaller");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
