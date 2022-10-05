package com.gourdetinc.SpringBootPractice.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import org.springframework.stereotype.Service;

import com.gourdetinc.SpringBootPractice.dtos.CardResponseDto;
import com.gourdetinc.SpringBootPractice.entities.Card;
import com.gourdetinc.SpringBootPractice.mappers.CardMapper;
import com.gourdetinc.SpringBootPractice.repositories.CardRepository;
import com.gourdetinc.SpringBootPractice.services.CardService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
	private final CardRepository cardRepository;

	private final CardMapper cardMapper;

	@Override
	public List<CardResponseDto> getAllCards() {
		return cardMapper.cardsToReponseDtos(cardRepository.findAll());

	}

	@Override
	public CardResponseDto postCard(CardResponseDto cardToPost) {
		Card cardToBePosted = cardMapper.responseDtoToCard(cardToPost);
		return cardMapper.cardToResponseDto(cardRepository.saveAndFlush(cardToBePosted));
		
		
	}

	@Override
	public List<CardResponseDto> postAllCards(List<CardResponseDto> cardsToPost) {
		List<Card> cardsToBeSet = new ArrayList<Card>();
		for(CardResponseDto card : cardsToPost) {
			if(card.getIdentifiers().contains(", ")) {
				List<String> ids = Arrays.asList(card.getIdentifiers().split(", "));
				List<String> setIds = Arrays.asList(card.getSetIdentifiers().split(", "));
				if(ids.size() > 1 || setIds.size() > 1) {
					for(int i =0; i < ids.size(); i++) {
						Card newCard = cardMapper.responseDtoToCard(card);
						newCard.setIdentifiers(ids.get(i));
						newCard.setSetIdentifiers(setIds.get(i));
						cardsToBeSet.add(newCard);
					}
				}
			}
		}
		return cardMapper.cardsToReponseDtos(cardRepository.saveAllAndFlush(cardsToBeSet));
	}

}
