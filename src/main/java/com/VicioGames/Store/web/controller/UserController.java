package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.domain.endpointdto.userdets.DatUserDto;
import com.VicioGames.Store.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{userId}")
    public Optional<DatUserDto> getByUserId(@PathVariable("userId")int uId){
        return userService.getByUserId(uId);
    }

    @PostMapping("/new")
    public UserDto createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId")int uId) {
        userService.deleteUser(uId);
    }

}
