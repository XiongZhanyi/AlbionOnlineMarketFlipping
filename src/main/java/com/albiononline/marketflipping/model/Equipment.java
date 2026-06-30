package com.albiononline.marketflipping.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

@RequiredArgsConstructor
public class Equipment {
	private final @NonNull @Getter EquipmentType equipmentType;
	private final @NonNull @Getter Tier tier;
	private final @NonNull @Getter Enchantment enchantment;
	
	public @NonNull String getCodeName() {
		return "%s_%s%s".formatted(tier.getCodeName(), equipmentType.getCodeName(), enchantment.getCodeName());
	}
	
	public @NonNull String getDisplayName() {
		return "%s%s %s".formatted(tier.getDisplayName(), enchantment.getDisplayName(), equipmentType.getDisplayName());
	}
}
