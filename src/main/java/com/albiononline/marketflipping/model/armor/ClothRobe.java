package com.albiononline.marketflipping.model.armor;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ClothRobe implements EquipmentType {
    SCHOLAR_ROBE("ARMOR_CLOTH_SET1", "Scholar Robe"),
    CLERIC_ROBE("ARMOR_CLOTH_SET2", "Cleric Robe"),
    MAGE_ROBE("ARMOR_CLOTH_SET3", "Mage Robe"),
    DRUID_ROBE("ARMOR_CLOTH_KEEPER", "Druid Robe"),
    FIEND_ROBE("ARMOR_CLOTH_HELL", "Fiend Robe"),
    CULTIST_ROBE("ARMOR_CLOTH_MORGANA", "Cultist Robe"),
    FEYSCALE_ROBE("ARMOR_CLOTH_FEY", "Feyscale Robe"),
    ROBE_OF_PURITY("ARMOR_CLOTH_AVALON", "Robe of Purity"),
    ROYAL_ROBE("ARMOR_CLOTH_ROYAL@1", "Royal Robe");

    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
