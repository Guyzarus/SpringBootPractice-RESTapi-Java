package com.gourdetinc.SpringBootPractice.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Data
public class UserRequestDto {
	
	@NonNull
	private String userName;
	@NonNull
	private String password;
	
	
	

}
