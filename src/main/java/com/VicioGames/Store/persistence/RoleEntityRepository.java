package com.VicioGames.Store.persistence;

import com.VicioGames.Store.persistence.crud.RoleEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RoleEntityRepository {

    @Autowired
    private RoleEntityCrudRepository roleEntityCrudRepository;

public Optional<RoleEntity> getByRoleId(int roleId){
    return roleEntityCrudRepository.findById(roleId);
}


}
