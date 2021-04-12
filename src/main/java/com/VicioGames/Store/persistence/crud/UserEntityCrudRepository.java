package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserEntityCrudRepository extends CrudRepository<UserEntity, Integer> {
}
