package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserDomainRepository {

    List<UserDto> getAll();
    Optional<UserDto> getByUserId(int userId);
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto);
}
