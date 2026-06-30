package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Sword implements EquipmentType {
    BROADSWORD("MAIN_SWORD", "Broadsword"),
    CLAYMORE("2H_CLAYMORE", "Claymore"),
    DUAL_SWORDS("2H_DUALSWORD", "Dual Swords"),
    CLARENT_BLADE("MAIN_SCIMITAR_MORGANA", "Clarent Blade"),
    CARVING_SWORD("2H_CLEAVER_HELL", "Carving Sword"),
    GALATINE_PAIR("2H_DUALSCIMITAR_UNDEAD", "Galatine Pair"),
    KINGMAKER("2H_CLAYMORE_AVALON", "Kingmaker"),
    INFINITY_BLADE("MAIN_SWORD_CRYSTAL", "Infinity Blade");

    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
