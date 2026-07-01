package com.albiononline.marketflipping.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

public record Equipment(EquipmentType equipmentType, Tier tier, Enchantment enchantment) {
    public String getCodeName() {
        return "%s_%s%s".formatted(
            tier().getCodeName(),
            equipmentType().getCodeName(),
            enchantment().getCodeName()
        );
    }

	public String getDisplayName() {
	    return "%s%s %s".formatted(
	        tier().getDisplayName(),
	        enchantment().getDisplayName(),
	        equipmentType().getDisplayName());
	}
}
