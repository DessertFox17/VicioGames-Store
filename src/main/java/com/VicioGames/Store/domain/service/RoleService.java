package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.postput.RoleDto;
import com.VicioGames.Store.domain.repository.RoleDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleDomainRepository roleDomainRepository;

    public Optional<List<RoleDto>> getByRole(String role){
        return roleDomainRepository.getByRole(role);
    }




}
