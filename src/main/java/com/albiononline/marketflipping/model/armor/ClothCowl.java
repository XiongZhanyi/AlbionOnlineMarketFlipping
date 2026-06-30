package com.albiononline.marketflipping.model.armor;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ClothCowl implements EquipmentType {
    SCHOLAR_COWL("HEAD_CLOTH_SET1", "Scholar Cowl"),
    CLERIC_COWL("HEAD_CLOTH_SET2", "Cleric Cowl"),
    MAGE_COWL("HEAD_CLOTH_SET3", "Mage Cowl"),
    DRUID_COWL("HEAD_CLOTH_KEEPER", "Druid Cowl"),
    FIEND_COWL("HEAD_CLOTH_HELL", "Fiend Cowl"),
    CULTIST_COWL("HEAD_CLOTH_MORGANA", "Cultist Cowl"),
    FEYSCALE_HAT("HEAD_CLOTH_FEY", "Feyscale Hat"),
    COWL_OF_PURITY("HEAD_CLOTH_AVALON", "Cowl of Purity"),
    ROYAL_COWL("HEAD_CLOTH_ROYAL@1", "Royal Cowl");

    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
