package com.albiononline.marketflipping.model;

import java.util.Arrays;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Tier {
//	T1("T1", "Beginner's"),
//	T2("T2", "Novice's"),
//	T3("T3", "Journeyman's"),
	T4("T4", "Adept's"),
	T5("T5", "Expert's"),
	T6("T6", "Master's"),
	T7("T7", "Grandmaster's"),
	T8("T8", "Elder's"),
	;
	
	private final @NonNull String codeName;
    private final @NonNull String displayName;
}
