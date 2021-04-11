package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoleEntityCrudRepository extends CrudRepository<RoleEntity, Integer> {
}
