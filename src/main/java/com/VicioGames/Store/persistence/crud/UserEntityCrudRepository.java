package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface UserEntityCrudRepository extends CrudRepository<UserEntity, Integer> {
}
