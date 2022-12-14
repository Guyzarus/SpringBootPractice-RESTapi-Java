package com.gourdetinc.SpringBootPractice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gourdetinc.SpringBootPractice.dtos.DeckRequestDto;
import com.gourdetinc.SpringBootPractice.dtos.DeckResponseDto;
import com.gourdetinc.SpringBootPractice.services.DeckService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/deck")
public class DeckController {

	private final DeckService deckService;

	@GetMapping("/all")
	public List<DeckResponseDto> getAllDecks() {

		return deckService.getAllDecks();
	}

	@PostMapping("/create")
	public DeckResponseDto createDeck(@RequestBody DeckRequestDto requestDeck) {

		return deckService.createDeck(requestDeck);
	}

}
