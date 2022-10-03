package com.gourdetinc.SpringBootPractice.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Deck {

	@Id
	@GeneratedValue
	private Long id;
	@OneToMany
	private List<Card> cardList;
	@Column
	private String author;
	@Column
	private String deckName;
	@Column
	private String hero;

}
