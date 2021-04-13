package com.VicioGames.Store.domain.endpointdto;

import java.util.List;

public class RoleDto {

    private int rId;
    private String role;
    private List<UserDto> users;

    //----------------GETTERS Y SETTERS ----------------------

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
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

