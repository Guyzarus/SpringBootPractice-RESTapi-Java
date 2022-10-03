package com.gourdetinc.SpringBootPractice.dtos;

import java.util.List;



import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DeckRequestDto {

	private String author;
	private String deckName;
	private String hero;
	private List<CardRequestDto> cardList;
	
	
}
