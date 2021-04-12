package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserDto> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{userId}")
    public Optional<UserDto> getByUserId(@PathVariable("userId")int userId){
        return userService.getByUserId(userId);
    }

    @PostMapping("/save")
    public UserDto createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }

}
