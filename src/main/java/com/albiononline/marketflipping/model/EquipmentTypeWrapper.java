package com.albiononline.marketflipping.model;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.albiononline.marketflipping.model.armor.*;
import com.albiononline.marketflipping.model.weapons.*;

import lombok.NonNull;

public class EquipmentTypeWrapper {
	
    private static final List<Class<? extends EquipmentType>> EQUIPMENTS = List.of(
    	ClothCowl.class,
    	ClothRobe.class,
    	ClothSandal.class,
    	LeatherHood.class,
    	LeatherJacket.class,
    	LeatherShoes.class,
    	PlateHelmet.class,
    	PlateArmor.class,
    	PlateBoots.class,
    	Arcanist.class,
    	Axe.class,
    	Bow.class,
    	Crossbow.class,
    	FrostMage.class,
    	Hammer.class,
    	Mace.class,
    	NatureStaff.class,
    	Priest.class,
    	Pyromancer.class,
    	Quarterstaff.class,
    	Shapeshifter.class,
    	Shield.class,
    	Spear.class,
    	Sword.class,
    	TomeFighter.class,
    	TorchFighter.class,
    	WarGloves.class,
    	Warlock.class    	
    );
    
    public @NonNull List<EquipmentType> retrieveAllEquipments() {
        return EQUIPMENTS.stream()
                .filter(Class::isEnum)
                .<EquipmentType>flatMap(e -> Arrays.stream(e.getEnumConstants()))
                .collect(Collectors.toList());
    }
}
