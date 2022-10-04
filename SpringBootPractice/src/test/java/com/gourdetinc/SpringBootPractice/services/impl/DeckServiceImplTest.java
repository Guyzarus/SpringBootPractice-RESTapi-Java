package com.gourdetinc.SpringBootPractice.services.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.gourdetinc.SpringBootPractice.dtos.CardRequestDto;
import com.gourdetinc.SpringBootPractice.dtos.DeckRequestDto;
import com.gourdetinc.SpringBootPractice.dtos.DeckResponseDto;
import com.gourdetinc.SpringBootPractice.entities.Card;
import com.gourdetinc.SpringBootPractice.entities.Deck;
import com.gourdetinc.SpringBootPractice.mappers.CardMapper;
import com.gourdetinc.SpringBootPractice.mappers.DeckMapper;
import com.gourdetinc.SpringBootPractice.repositories.CardRepository;
import com.gourdetinc.SpringBootPractice.repositories.DeckRepository;


class DeckServiceImplTest {
	
	@Mock
	private DeckRepository deckRepository;
	@Mock
	private DeckMapper deckMapper;
	@Mock
	private CardMapper cardMapper;
	@Mock
	private CardRepository cardRepository;
	@InjectMocks
	private DeckServiceImpl deckServiceImpl;
	
	private AutoCloseable closeable;
	
	@BeforeEach
	void setUp() {
		closeable = MockitoAnnotations.openMocks(this);
		
	}
	@AfterEach
	void tearDown() throws Exception {
		closeable.close();
	}

	@Test
	void getAllDecks_validRequest_returnsListofDecks() {
		//GIVEN
		List<Deck> decks = new ArrayList<>();
		Deck deck = new Deck();
		DeckResponseDto deckResponseDto = new DeckResponseDto();
		List<DeckResponseDto> listOfDeckResponseDtos = new ArrayList<>();
		decks.add(deck);
		listOfDeckResponseDtos.add(deckResponseDto);
		
		//WHEN
		when(deckRepository.findAll()).thenReturn(decks);
		when(deckMapper.decksToResponseDtos(decks)).thenReturn(listOfDeckResponseDtos);
		List<DeckResponseDto> result = deckServiceImpl.getAllDecks();
				
		//THEN
		assertNotNull(result);
		assertEquals(DeckResponseDto.class, result.get(0).getClass());
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void createDeck_providesValidDeckRequestDto_returnsDeckResponseDto() {
		
		//GIVEN
		DeckResponseDto deckResponseDto = new DeckResponseDto();
		DeckRequestDto deckRequestDto = new DeckRequestDto();
		List<Card> listOfCards = new ArrayList<>();
		List<CardRequestDto> listOfCardRequestDtos = new ArrayList<>();
		CardRequestDto cardRequestDto = new CardRequestDto();
		cardRequestDto.setId("1");
		listOfCardRequestDtos.add(cardRequestDto);
		deckRequestDto.setCardList(listOfCardRequestDtos);
		Card card = new Card();
		String cardId = "1"; 
		card.setCardId(cardId);
		
		
		listOfCards.add(card);
		Deck deck = new Deck();
		
		
		//WHEN
		when(cardRepository.findCardByCard_CardId(cardId)).thenReturn(Optional.of(card));
		when(deckRepository.saveAndFlush(deck)).thenReturn(deck);
		when(deckMapper.deckToResponseDto(deck)).thenReturn(deckResponseDto);
		DeckResponseDto result = deckServiceImpl.createDeck(deckRequestDto);
		System.out.println(result);
		
		//THEN
//		assertNotNull(result);
		assertEquals("1", result.getCardList().get(0).getCardId());
	}
	

}
