package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.domain.endpointdto.userdets.DatUserDto;

import java.util.Optional;

public interface UserDomainRepository {

    Optional<DatUserDto> getByUserId(int uId);
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto);
    void deleteUser(int uId);
}
