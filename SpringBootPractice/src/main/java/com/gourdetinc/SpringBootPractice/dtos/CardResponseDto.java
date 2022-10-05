package com.gourdetinc.SpringBootPractice.dtos;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CardResponseDto {

	private String identifiers;
	private String setIdentifiers;
	private String name;
	private Long pitch;
	private String cost;
	private String power;
	private Long defense;
	private Long health;
	private String intelligence;
	private String rarity;
	private String types;
	private String cardKeywords;
	private String abilitiesAndEffects;
	private String abilitiesAndEffectsKeywords;
	private String grantedKeywords;
	private String functionalText;
	private String flavorText;
	private String typeText;
	private String artists;
	private boolean cardPlayedHorizontally;
	private boolean blitzLegal;
	private boolean ccLegal;
	private boolean commonerLegal;
	private String blitzLivingLegend;
	private String ccLivingLegend;
	private String blitzBanned;
	private String ccBanned;
	private String commonerBanned;
	private String blitzSuspendedStart;
	private String blitzSuspendedEnd;
	private String ccSuspendedStart;
	private String ccSuspendedEnd;
	private String commonerSuspendedStart;
	private String commonerSuspendedEnd;
	private String variations;
}
