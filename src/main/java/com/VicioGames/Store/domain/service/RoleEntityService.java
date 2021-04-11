package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.repository.RoleDomainRepository;
import com.VicioGames.Store.persistence.RoleEntityRepository;
import com.VicioGames.Store.persistence.entity.RoleEntity;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleEntityService {

    @Autowired
    private RoleDomainRepository roleDomainRepository;

    public Optional<RoleEntity> getByRoleId(int roleId){
        return roleDomainRepository.getByRoleId(roleId);
    }
}
