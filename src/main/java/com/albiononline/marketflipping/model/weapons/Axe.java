package com.albiononline.marketflipping.model.weapons;

import com.albiononline.marketflipping.model.EquipmentType;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Axe implements EquipmentType {
    BATTLEAXE("MAIN_AXE", "Battleaxe"),
    GREATAXE("2H_AXE", "Greataxe"),
    HALBERD("2H_HALBERD", "Halberd"),
    CARRIONCALLER("2H_HALBERD_MORGANA", "Carrioncaller"),
    INFERNAL_SCYTHE("2H_SCYTHE_HELL", "Infernal Scythe"),
    BEAR_PAWS("2H_DUALAXE_KEEPER", "Bear Paws"),
    REALMBREAKER("2H_AXE_AVALON", "Realmbreaker"),
    CRYSTAL_REAPER("2H_SCYTHE_CRYSTAL", "Crystal Reaper");

    private final @NonNull String codeName;
    private final @NonNull String displayName;
}
