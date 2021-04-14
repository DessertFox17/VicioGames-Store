package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserEntityCrudRepository extends CrudRepository<UserEntity, Integer> {
    List<UserEntity> findBypRoleId(int rId);
}
