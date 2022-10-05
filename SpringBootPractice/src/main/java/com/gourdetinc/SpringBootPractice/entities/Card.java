package com.gourdetinc.SpringBootPractice.entities;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Data
@Getter
@Setter
public class Card {
	@Id
	private String identifiers;
	@Column
	private String setIdentifiers;
	@Column
	private String name;
	@Column
	private Long pitch;
	@Column
	private String cost;
	@Column
	private String power;
	@Column
	private Long defense;
	@Column
	private Long health;
	@Column
	private String intelligence;
	@Column
	private String rarity;
	@Column
	private String types;
	@Column
	private String cardKeywords;
	@Column
	private String abilitiesAndEffects;
	@Column
	private String abilitiesAndEffectsKeywords;
	@Column
	private String grantedKeywords;
	@Column(columnDefinition="TEXT", length = 2048)
	private String functionalText;
	@Column
	private String flavorText;
	@Column
	private String typeText;
	@Column
	private String artists;
	@Column
	private boolean cardPlayedHorizontally;
	@Column
	private boolean blitzLegal;
	@Column
	private boolean ccLegal;
	@Column
	private boolean commonerLegal;
	@Column
	private String blitzLivingLegend;
	@Column
	private String ccLivingLegend;
	@Column
	private String blitzBanned;
	@Column
	private String ccBanned;
	@Column
	private String commonerBanned;
	@Column
	private String blitzSuspendedStart;
	@Column
	private String blitzSuspendedEnd;
	@Column
	private String ccSuspendedStart;
	@Column
	private String ccSuspendedEnd;
	@Column
	private boolean commonerSuspendedStart;
	@Column
	private boolean commonerSuspendedEnd;
	@Column
	private String variations;

}
