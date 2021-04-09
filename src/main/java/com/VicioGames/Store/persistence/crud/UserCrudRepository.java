package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
}
