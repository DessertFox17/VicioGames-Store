package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.RoleDto;
import com.VicioGames.Store.domain.repository.RoleDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleDomainRepository roleDomainRepository;

    public List<RoleDto> getAll(){
        return roleDomainRepository.getAll();
    }

    /*public Optional<List<RoleDto>> getByRoleType(int id){
        return roleDomainRepository.getByRoleType(id);
    }*/
}
