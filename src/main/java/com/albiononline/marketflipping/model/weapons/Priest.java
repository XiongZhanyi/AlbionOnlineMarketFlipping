package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Priest implements EquipmentType {
    HOLY_STAFF("MAIN_HOLYSTAFF", "Holy Staff"),
    GREAT_HOLY_STAFF("2H_HOLYSTAFF", "Great Holy Staff"),
    DIVINE_STAFF("2H_DIVINESTAFF", "Divine Staff"),
    LIFETOUCH_STAFF("MAIN_HOLYSTAFF_MORGANA", "Lifetouch Staff"),
    FALLEN_STAFF("2H_HOLYSTAFF_HELL", "Fallen Staff"),
    REDEMPTION_STAFF("2H_HOLYSTAFF_UNDEAD", "Redemption Staff"),
    HALLOWFALL("MAIN_HOLYSTAFF_AVALON", "Hallowfall"),
    EXALTED_STAFF("2H_HOLYSTAFF_CRYSTAL", "Exalted Staff");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}