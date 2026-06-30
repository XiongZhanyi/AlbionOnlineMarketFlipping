package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Quarterstaff implements EquipmentType {
    QUARTERSTAFF("2H_QUARTERSTAFF", "Quarterstaff"),
    IRON_CLAD_STAFF("2H_IRONCLADEDSTAFF", "Iron Clad Staff"),
    DOUBLE_BLADED_STAFF("2H_DOUBLEBLADEDSTAFF", "Double Bladed Staff"),
    BLACK_MONK_STAVE("2H_COMBATSTAFF_MORGANA", "Black Monk Stave"),
    SOULSCYTHE("2H_TWINSCYTHE_HELL", "Soulscythe"),
    STAFF_OF_BALANCE("2H_ROCKSTAFF_KEEPER", "Staff of Balance"),
    GRAILSEEKER("2H_QUARTERSTAFF_AVALON", "Grailseeker"),
    PHANTOM_TWINBLADE("2H_DOUBLEBLADEDSTAFF_CRYSTAL", "Phantom Twinblade");
	
    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
