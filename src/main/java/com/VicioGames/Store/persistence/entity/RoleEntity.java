package com.VicioGames.Store.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "roleId")
@Data
@Entity
@Table(name = "role")
public class RoleEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "r_name")
    private String rName;

    //----------------RELATIONSHIPS--------------------------

    @OneToMany(mappedBy = "role")
    private List<UserEntity> users;

}
