package com.albiononline.marketflipping.model.armor;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum PlateHelmet implements EquipmentType {
    SOLDIER_HELMET("HEAD_PLATE_SET1", "Soldier Helmet"),
    KNIGHT_HELMET("HEAD_PLATE_SET2", "Knight Helmet"),
    GUARDIAN_HELMET("HEAD_PLATE_SET3", "Guardian Helmet"),
    GRAVEGUARD_HELMET("HEAD_PLATE_UNDEAD", "Graveguard Helmet"),
    DEMON_HELMET("HEAD_PLATE_HELL", "Demon Helmet"),
    JUDICATOR_HELMET("HEAD_PLATE_KEEPER", "Judicator Helmet"),
    DUSKWEAVER_HELMET("HEAD_PLATE_FEY", "Duskweaver Helmet"),
    HELMET_OF_VALOR("HEAD_PLATE_AVALON", "Helmet of Valor"),
    ROYAL_HELMET("HEAD_PLATE_ROYAL", "Royal Helmet");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
