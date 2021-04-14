package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleEntityCrudRepository extends CrudRepository<RoleEntity, Integer> {
    List<RoleEntity> findByrName(String rName);
}
