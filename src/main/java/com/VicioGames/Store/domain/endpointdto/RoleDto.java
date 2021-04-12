package com.VicioGames.Store.domain.endpointdto;

import java.util.List;

public class RoleDto {

    private int id;
    private String role;
    private List<UserDto> users;

    //----------------GETTERS Y SETTERS ----------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<UserDto> getUsers() {
        return users;
    }

    public void setUsers(List<UserDto> users) {
        this.users = users;
    }
}

