package com.VicioGames.Store.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.List;

@Entity
@Table(name = "role")
public class RoleEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer pRoleId;

    @Column(name = "r_name")
    private String rName;

    //----------------RELATIONSHIPS--------------------------

    @OneToMany(mappedBy = "pRole", cascade = {CascadeType.ALL})
    private List<UserEntity> pUsers;

    //----------------GETTERS Y SETTERS ----------------------

    public Integer getpRoleId() {
        return pRoleId;
    }

    public void setpRoleId(Integer pRoleId) {
        this.pRoleId = pRoleId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public List<UserEntity> getpUsers() {
        return pUsers;
    }

    public void setpUsers(List<UserEntity> pUsers) {
        this.pUsers = pUsers;
    }
}
