package com.albiononline.marketflipping.model.armor;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum PlateBoots implements EquipmentType{
    SOLDIER_BOOTS("SHOES_PLATE_SET1", "Soldier Boots"),
    KNIGHT_BOOTS("SHOES_PLATE_SET2", "Knight Boots"),
    GUARDIAN_BOOTS("SHOES_PLATE_SET3", "Guardian Boots"),
    GRAVEGUARD_BOOTS("SHOES_PLATE_UNDEAD", "Graveguard Boots"),
    DEMON_BOOTS("SHOES_PLATE_HELL", "Demon Boots"),
    JUDICATOR_BOOTS("SHOES_PLATE_KEEPER", "Judicator Boots"),
    DUSKWEAVER_BOOTS("SHOES_PLATE_FEY", "Duskweaver Boots"),
    BOOTS_OF_VALOR("SHOES_PLATE_AVALON", "Boots of Valor"),
    ROYAL_BOOTS("SHOES_PLATE_ROYAL", "Royal Boots");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
