package com.gourdetinc.SpringBootPractice.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.gourdetinc.SpringBootPractice.dtos.UserRequestDto;
import com.gourdetinc.SpringBootPractice.dtos.UserResponseDto;
import com.gourdetinc.SpringBootPractice.entities.User;

@Mapper (componentModel = "spring", uses = {DeckMapper.class})
public interface UserMapper {

	UserRequestDto userToRequestDto(User user);
	
	UserResponseDto userToResponseDto(User user);
	
	User requestDtoToUser (UserRequestDto userRequestDto);
	
	User responseDtoToUser (UserResponseDto userResponseDto);
	
	List<UserResponseDto> usersToDtos (List<User> users);
}
