package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.domain.endpointdto.userdets.DatUserDto;
import com.VicioGames.Store.domain.repository.UserDomainRepository;
import com.VicioGames.Store.persistence.crud.UserEntityCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDomainRepository userDomainRepository;
    @Autowired
    private UserEntityCrudRepository userEntityCrudRepository;


    public Optional<DatUserDto> getByUserId(int uId) {
        return userDomainRepository.getByUserId(uId);
    }


    public UserDto createUser(UserDto userDto) {
        return userDomainRepository.createUser(userDto);
    }

    public void deleteUser(int uId) {
        userDomainRepository.deleteUser(uId);
    }
}


