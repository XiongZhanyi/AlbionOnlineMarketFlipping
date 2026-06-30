package com.albiononline.marketflipping.model.armor;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum PlateArmor implements EquipmentType{
    SOLDIER_ARMOR("ARMOR_PLATE_SET1", "Soldier Armor"),
    KNIGHT_ARMOR("ARMOR_PLATE_SET2", "Knight Armor"),
    GUARDIAN_ARMOR("ARMOR_PLATE_SET3", "Guardian Armor"),
    GRAVEGUARD_ARMOR("ARMOR_PLATE_UNDEAD", "Graveguard Armor"),
    DEMON_ARMOR("ARMOR_PLATE_HELL", "Demon Armor"),
    JUDICATOR_ARMOR("ARMOR_PLATE_KEEPER", "Judicator Armor"),
    DUSKWEAVER_ARMOR("ARMOR_PLATE_FEY", "Duskweaver Armor"),
    ARMOR_OF_VALOR("ARMOR_PLATE_AVALON", "Armor of Valor"),
    ROYAL_ARMOR("ARMOR_PLATE_ROYAL", "Armor Helmet");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
