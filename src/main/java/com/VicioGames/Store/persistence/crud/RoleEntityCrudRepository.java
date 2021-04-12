package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RoleEntityCrudRepository extends CrudRepository<RoleEntity, Integer> {
    //Optional<List<RoleEntity>> findByRoleId(int roleId);
}
