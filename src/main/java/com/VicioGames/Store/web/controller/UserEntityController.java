package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.service.UserEntityService;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserEntityController {

    @Autowired
    private UserEntityService userEntityService;

    @GetMapping("/all")
    public List<UserEntity> getAll(){
        return userEntityService.getAll();
    }

    @GetMapping("/{userId}")
    public Optional<UserEntity> getByUserId(@PathVariable("userId")int userId){
        return userEntityService.getByUserId(userId);
    }

    @PostMapping("/save")
    public UserEntity save(@RequestBody UserEntity userEntity){
        return userEntityService.save(userEntity);
    }


}
