package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.service.RoleEntityService;
import com.VicioGames.Store.persistence.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/role")
public class RoleEntityController {

    @Autowired
    private RoleEntityService roleEntityService;

    @GetMapping("/{roleId}")
    public Optional<RoleEntity> getByRoleId(@PathVariable("roleId") int roleId){
        return roleEntityService.getByRoleId(roleId);
    }
}
