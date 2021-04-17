package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.postput.UserDto;
import com.VicioGames.Store.domain.repository.UserDomainRepository;
import com.VicioGames.Store.persistence.crud.UserEntityCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDomainRepository userDomainRepository;
    @Autowired
    private UserEntityCrudRepository userEntityCrudRepository;

    public List<UserDto> getAll() {
        return userDomainRepository.getAll();
    }

    public Optional<UserDto> getByUserId(int uId) {
        return userDomainRepository.getByUserId(uId);
    }

    public Optional<List<UserDto>> getByRoleId(int rId) {
        return userDomainRepository.getByRoleId(rId);
    }

    public UserDto createUser(UserDto userDto) {
        userDomainRepository.createUser(userDto);
        return null;
    }

    public void deleteUser(int uId) {
        if (userDomainRepository.getByUserId(uId).isPresent()) {
            userDomainRepository.deleteUser(uId);
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}

