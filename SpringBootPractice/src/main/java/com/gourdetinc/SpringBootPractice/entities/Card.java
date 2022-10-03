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
	private String cardId;
	@Column
	private String name;
	@Column
	private Long pitchCost;
	@Column
	private Long resourceCost;
	@Column
	private String cardType;
	@Column
	private Long attackValue;
	@Column
	private Long blockValue;
	@Column
	private String classType;

}
