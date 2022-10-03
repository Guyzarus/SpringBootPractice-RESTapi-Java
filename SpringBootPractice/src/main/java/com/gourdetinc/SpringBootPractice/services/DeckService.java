package com.gourdetinc.SpringBootPractice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gourdetinc.SpringBootPractice.dtos.DeckRequestDto;
import com.gourdetinc.SpringBootPractice.dtos.DeckResponseDto;

@Service
public interface DeckService {

	List<DeckResponseDto> getAllDecks();

	DeckResponseDto createDeck(DeckRequestDto requestDeck);

}
