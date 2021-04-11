package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.domain.repository.UserDomainRepository;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserEntityService {

    @Autowired
    private UserDomainRepository userDomainRepository;

    public List<UserDto> getAll() {
        return userDomainRepository.getAll();
    }


    public Optional<UserDto> getByUserId(int userId) {
        return userDomainRepository.getByUserId(userId);
    }


    public UserDto save(UserDto userDto) {
        return userDomainRepository.save(userDto);
    }

}
