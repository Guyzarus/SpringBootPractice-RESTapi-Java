package com.gourdetinc.SpringBootPractice.services.impl;

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
		cardToBePosted.setCardId(cardToPost.getCardId());
		cardToBePosted.setName(cardToPost.getName());
		cardToBePosted.setPitchCost(cardToPost.getPitchCost());
		cardToBePosted.setResourceCost(cardToPost.getResourceCost());
		cardToBePosted.setAttackValue(cardToPost.getAttackValue());
		cardToBePosted.setBlockValue(cardToPost.getBlockValue());
		cardToBePosted.setCardType(cardToPost.getCardType());
		cardToBePosted.setClassType(cardToPost.getClassType());
		
		return cardMapper.cardToResponseDto(cardRepository.saveAndFlush(cardToBePosted));
		
		
	}

}
