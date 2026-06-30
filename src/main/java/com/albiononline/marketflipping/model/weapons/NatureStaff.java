package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum NatureStaff implements EquipmentType {
    NATURE_STAFF("MAIN_NATURESTAFF", "Nature Staff"),
    GREAT_NATURE_STAFF("2H_NATURESTAFF", "Great Nature Staff"),
    WILD_STAFF("2H_WILDSTAFF", "Wild Staff"),
    DRUIDIC_STAFF("MAIN_NATURESTAFF_KEEPER", "Druidic Staff"),
    BLIGHT_STAFF("2H_NATURESTAFF_HELL", "Blight Staff"),
    RAMPANT_STAFF("2H_NATURESTAFF_KEEPER", "Rampant Staff"),
    IRONROOT_STAFF("MAIN_NATURESTAFF_AVALON", "Ironroot Staff");

    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
