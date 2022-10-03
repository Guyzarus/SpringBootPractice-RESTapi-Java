package com.gourdetinc.SpringBootPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gourdetinc.SpringBootPractice.dtos.CardResponseDto;
import com.gourdetinc.SpringBootPractice.services.CardService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/card")
public class CardController {

	@Autowired
	private final CardService cardService;
	
	@GetMapping("/all")
	public List<CardResponseDto> getAllCards(){
		return cardService.getAllCards();
		
	}
	
	@PostMapping("/add")
	public CardResponseDto postCard(@RequestBody CardResponseDto cardToPost) {
		return cardService.postCard(cardToPost);
	} 
}
