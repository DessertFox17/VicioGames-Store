package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.persistence.RoleEntityRepository;
import com.VicioGames.Store.persistence.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleEntityService {

    @Autowired
    private RoleEntityRepository roleEntityRepository;

    public Optional<RoleEntity> getByRoleId(int roleId){
        return roleEntityRepository.getByRoleId(roleId);
    }
}
