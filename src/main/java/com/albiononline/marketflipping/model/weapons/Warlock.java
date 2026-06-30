package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Warlock implements EquipmentType {
    CURSED_STAFF("MAIN_CURSEDSTAFF", "Cursed Staff"),
    GREAT_CURSED_STAFF("2H_CURSEDSTAFF", "Great Cursed Staff"),
    DEMONIC_STAFF("2H_DEMONICSTAFF", "Demonic Staff"),
    LIFECURSE_STAFF("MAIN_CURSEDSTAFF_UNDEAD", "Lifecurse Staff"),
    CURSED_SKULL("2H_SKULLORB_HELL", "Cursed Skull"),
    DAMNATION_STAFF("2H_CURSEDSTAFF_MORGANA", "Damnation Staff"),
    SHADOWCALLER("MAIN_CURSEDSTAFF_AVALON", "Shadowcaller");

    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
