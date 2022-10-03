package com.gourdetinc.SpringBootPractice.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.gourdetinc.SpringBootPractice.dtos.CardRequestDto;
import com.gourdetinc.SpringBootPractice.dtos.CardResponseDto;
import com.gourdetinc.SpringBootPractice.entities.Card;

@Mapper(componentModel = "spring")
public interface CardMapper {

	CardRequestDto cardToRequestDto(Card card);
	
	CardResponseDto cardToResponseDto(Card card);
	
	Card responseDtoToCard(CardResponseDto cardResponseDto);
	
	Card requestDtoToCard(CardRequestDto cardRequestDto);
	
	List<CardResponseDto> cardsToReponseDtos(List<Card> cards);
	
	List<Card> requestDtosToCards (List<CardRequestDto> cardDtos);
	
}
