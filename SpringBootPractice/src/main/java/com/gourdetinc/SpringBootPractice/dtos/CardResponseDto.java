package com.gourdetinc.SpringBootPractice.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CardResponseDto {

	private String cardId;
	private String name;
	private String cardType;
	private Long pitchValue;
	private Long resourceCost;
	private Long attackValue;
	private Long blockValue;
	private String classType;
	
	
	
}
