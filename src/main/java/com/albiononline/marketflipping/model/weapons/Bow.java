package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Bow implements EquipmentType {
    BOW("2H_BOW", "Bow"),
    WARBOW("2H_WARBOW", "Warbow"),
    LONGBOW("2H_LONGBOW", "Longbow"),
    WHISPERING_BOW("2H_LONGBOW_UNDEAD", "Whispering Bow"),
    WAILING_BOW("2H_BOW_HELL", "Wailing Bow"),
    BOW_OF_BADON("2H_BOW_KEEPER", "Bow of Badon"),
    MISTPIERCER("2H_BOW_AVALON", "Mistpiercer");

    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
