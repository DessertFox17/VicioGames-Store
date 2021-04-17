package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.postput.UserDto;
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

    @GetMapping("/f/{userId}")
    public Optional<UserDto> getByUserId(@PathVariable("userId")int uId){
        return userService.getByUserId(uId);
    }

    @GetMapping("/fbr")
    public Optional<List<UserDto>> getByRoleId(@RequestParam("roleId")int rId) {
        return userService.getByRoleId(rId);
    }

    @PostMapping("/s")
    public UserDto createUser(@RequestBody UserDto userDto, @RequestParam(required = false) String name){
        System.out.println(name);
        return userService.createUser(userDto);
    }

    @DeleteMapping("/d/{id}")
    public void deleteUser(@PathVariable("id")int uId) {
        userService.deleteUser(uId);
    }

}
