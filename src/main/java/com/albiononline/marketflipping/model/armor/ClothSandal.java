package com.albiononline.marketflipping.model.armor;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ClothSandal implements EquipmentType {
    SCHOLAR_SANDAL("SHOES_CLOTH_SET1", "Scholar Sandal"),
    CLERIC_SANDAL("SHOES_CLOTH_SET2", "Cleric Sandal"),
    MAGE_SANDAL("SHOES_CLOTH_SET3", "Mage Sandal"),
    DRUID_SANDAL("SHOES_CLOTH_KEEPER", "Druid Sandal"),
    FIEND_SANDAL("SHOES_CLOTH_HELL", "Fiend Sandal"),
    CULTIST_SANDAL("SHOES_CLOTH_MORGANA", "Cultist Sandal"),
    FEYSCALE_SANDAL("SHOES_CLOTH_FEY", "Feyscale Sandal"),
    SANDAL_OF_PURITY("SHOES_CLOTH_AVALON", "Sandal of Purity"),
    ROYAL_SANDAL("SHOES_CLOTH_ROYAL@1", "Royal Sandal");

    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
