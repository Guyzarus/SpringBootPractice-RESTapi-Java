package com.gourdetinc.SpringBootPractice.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.gourdetinc.SpringBootPractice.dtos.DeckRequestDto;
import com.gourdetinc.SpringBootPractice.dtos.DeckResponseDto;
import com.gourdetinc.SpringBootPractice.entities.Deck;

@Mapper(componentModel = "spring", uses = {CardMapper.class, UserMapper.class})
public interface DeckMapper {
	
	DeckRequestDto deckToRequestDto (Deck deck);
	
	DeckResponseDto deckToResponseDto(Deck deck);
	
	Deck requestDtoToDeck (DeckRequestDto deckRequestDto);
	
	Deck responseDtoToDeck (DeckResponseDto deckResponseDto);
	
	List<DeckResponseDto> decksToResponseDtos (List<Deck> decks);

		
	
	
	
}
