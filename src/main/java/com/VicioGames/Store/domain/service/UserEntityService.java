package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.persistence.UserEntityRepository;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserEntityService {

    @Autowired
    private UserEntityRepository userEntityRepository;

    public List<UserEntity> getAll(){
        return userEntityRepository.getAll();
    }

    public Optional<UserEntity> getByUserId(int userId){
        return userEntityRepository.getByUserId(userId);
    }

    public UserEntity save(UserEntity userEntity){
        return userEntityRepository.save(userEntity);
    }

}
