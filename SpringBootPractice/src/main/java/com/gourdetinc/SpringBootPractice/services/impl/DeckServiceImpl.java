package com.gourdetinc.SpringBootPractice.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gourdetinc.SpringBootPractice.dtos.CardRequestDto;
import com.gourdetinc.SpringBootPractice.dtos.DeckRequestDto;
import com.gourdetinc.SpringBootPractice.dtos.DeckResponseDto;
import com.gourdetinc.SpringBootPractice.entities.Card;
import com.gourdetinc.SpringBootPractice.entities.Deck;
import com.gourdetinc.SpringBootPractice.mappers.CardMapper;
import com.gourdetinc.SpringBootPractice.mappers.DeckMapper;
import com.gourdetinc.SpringBootPractice.repositories.CardRepository;
import com.gourdetinc.SpringBootPractice.repositories.DeckRepository;
import com.gourdetinc.SpringBootPractice.services.DeckService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeckServiceImpl implements DeckService {

	private final DeckRepository deckRepository;

	private final DeckMapper deckMapper;

	private final CardMapper cardMapper;

	private final CardRepository cardRepository;

	@Override
	public List<DeckResponseDto> getAllDecks() {
		/*
		 * List<Deck> allDecks = new ArrayList(); allDecks = deckRepository.findAll();
		 * deckMapper.decksToResponseDtos(allDecks);
		 */
		return deckMapper.decksToResponseDtos(deckRepository.findAll());
	}

	@SuppressWarnings("deprecation")
	@Override
	public DeckResponseDto createDeck(DeckRequestDto deckToPost) {
		Deck deckToBePosted = new Deck();

		deckToBePosted.setAuthor(deckToPost.getAuthor());

		List<Card> cardsToSet = new ArrayList<>();
		for (CardRequestDto card : deckToPost.getCardList()) {
			cardsToSet.add(cardRepository.getById(card.getId()));

		}
		deckToBePosted.setCardList(cardsToSet);
		deckToBePosted.setDeckName(deckToPost.getDeckName());
		deckToBePosted.setHero(deckToPost.getHero());

		System.out.println(deckToBePosted);
		return deckMapper.deckToResponseDto(deckRepository.saveAndFlush(deckToBePosted));
	}

}
