package com.gourdetinc.SpringBootPractice.dtos;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Data
public class UserResponseDto {
	
	private String userName;
//	private List<DeckResponseDto> decks;
	private Boolean isAdmin;
	

}
