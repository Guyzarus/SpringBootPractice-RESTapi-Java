package com.gourdetinc.SpringBootPractice.entities;

import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "user_table")

public class User {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String userName;

	@Column
	private String password;
	@OneToMany
	private List<Deck> deckListDeck;
	@Column
	private Boolean isAdmin;
	@Column
	private String emailAddress;
}
