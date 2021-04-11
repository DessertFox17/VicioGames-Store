package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.persistence.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserDomainRepository {

    List<UserEntity> getAll();
    Optional<UserEntity> getByUserId(int userId);
    UserEntity save(UserEntity userEntity);
}
