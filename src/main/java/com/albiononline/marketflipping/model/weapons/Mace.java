package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Mace implements EquipmentType {
    MACE("MAIN_MACE", "Mace"),
    HEAVY_MACE("2H_MACE", "Heavy Mace"),
    MORNING_STAR("2H_FLAIL", "Morning Star"),
    BEDROCK_MACE("MAIN_ROCKMACE_KEEPER", "Bedrock Mace"),
    INCUBUS_MACE("MAIN_MACE_HELL", "Incubus Mace"),
    CAMLANN_MACE("2H_MACE_MORGANA", "Camlann Mace"),
    OATHKEEPERS("2H_DUALMACE_AVALON", "Oathkeepers"),
    DREADSTORM_CRYSTAL("ARTEFACT_MAIN_MACE_CRYSTAL", "Dreadstorm Crystal");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
