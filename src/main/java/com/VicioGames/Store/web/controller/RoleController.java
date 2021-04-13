package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.RoleDto;
import com.VicioGames.Store.domain.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/all")
    public ResponseEntity<List<RoleDto>> getAll(){
        return new ResponseEntity<>((roleService.getAll()), HttpStatus.OK);
    }

   /* @GetMapping("/r/{id}")
    public ResponseEntity<List<RoleDto>> getByRoleType(@PathVariable("id") int id){
        return roleService.getByRoleType(id).map(
                roleDtos -> new ResponseEntity<>(roleDtos,HttpStatus.OK)
        ).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }*/
}
