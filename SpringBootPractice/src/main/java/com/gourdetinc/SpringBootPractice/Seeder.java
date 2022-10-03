package com.gourdetinc.SpringBootPractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gourdetinc.SpringBootPractice.entities.*;
import com.gourdetinc.SpringBootPractice.repositories.*;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Seeder implements CommandLineRunner {

	private final CardRepository cardRepository;
	private final UserRepository userRepository;
	private final DeckRepository deckRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Card card1 = new Card();
		card1.setCardId("4rtf");
		card1.setName("Test");
		card1.setPitchCost((long) 2);
		card1.setResourceCost((long) 3);
		card1.setAttackValue((long) 6);
		card1.setCardType("Attack Action");
		card1.setBlockValue((long) 3);
		card1.setClassType("Brute");
		
		Card card2 = new Card();
		card2.setCardId("5arc");
		card2.setName("Test2");
		card2.setPitchCost((long) 2);
		card2.setResourceCost((long) 3);
		card2.setAttackValue((long) 6);
		card2.setCardType("Action");
		card2.setBlockValue((long) 3);
		card2.setClassType("Generic");

		
		cardRepository.saveAndFlush(card1);
		
		cardRepository.saveAndFlush(card2);
		
		
	}
}
