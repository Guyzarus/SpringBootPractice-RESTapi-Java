package com.gourdetinc.SpringBootPractice.services;

import java.util.List;



import com.gourdetinc.SpringBootPractice.dtos.CardResponseDto;


public interface CardService {

	List<CardResponseDto> getAllCards();

	CardResponseDto postCard(CardResponseDto cardToPost);

	List<CardResponseDto> postAllCards(List<CardResponseDto> cardsToPost);

}
