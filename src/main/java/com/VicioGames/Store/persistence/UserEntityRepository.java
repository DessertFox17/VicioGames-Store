package com.VicioGames.Store.persistence;

import com.VicioGames.Store.persistence.crud.UserEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserEntityRepository {

    @Autowired
    private UserEntityCrudRepository userEntityCrudRepository;

    public List<UserEntity> getAll() {
        return (List<UserEntity>) userEntityCrudRepository.findAll();
    }

    public Optional<UserEntity> getByUserId(int userId) {
        return userEntityCrudRepository.findById(userId);
    }

    public UserEntity save(UserEntity userEntity){

        return userEntityCrudRepository.save(userEntity);

    }
}
