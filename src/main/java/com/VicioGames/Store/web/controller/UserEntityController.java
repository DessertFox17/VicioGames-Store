package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.UserDto;
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
    public List<UserDto> getAll(){
        return userEntityService.getAll();
    }

    @GetMapping("/{userId}")
    public Optional<UserDto> getByUserId(@PathVariable("userId")int userId){
        return userEntityService.getByUserId(userId);
    }

    @PostMapping("/save")
    public UserDto save(@RequestBody UserDto userDto){
        return userEntityService.save(userDto);
    }


}
