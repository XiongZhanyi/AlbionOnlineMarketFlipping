package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Arcanist implements EquipmentType {
    ARCANE_STAFF("MAIN_ARCANESTAFF", "Arcane Staff"),
    GREAT_ARCANE_STAFF("2H_ARCANESTAFF", "Great Arcane Staff"),
    ENIGMATIC_STAFF("2H_ENIGMATICSTAFF", "Enigmatic Staff"),
    WITCHWORK_STAFF("MAIN_ARCANESTAFF_UNDEAD", "Witchwork Staff"),
    OCCULT_STAFF("2H_ARCANESTAFF_HELL", "Occult Staff"),
    MALEVOLENT_LOCUS("2H_ENIGMATICORB_MORGANA", "Malevolent Locus"),
    EVENSONG("2H_ARCANESTAFF_CRYSTAL", "Evensong"),
    ASTRAL_STAFF("2H_ARCANESTAFF_CRYSTAL", "Astral Staff");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
