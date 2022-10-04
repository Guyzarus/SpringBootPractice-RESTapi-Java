package com.gourdetinc.SpringBootPractice.dtos;

import java.util.List;

import com.gourdetinc.SpringBootPractice.entities.Card;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DeckResponseDto {
	
	private String deckName;
	private List<CardResponseDto> cardList;
	private String hero;
	private String author; 

}
