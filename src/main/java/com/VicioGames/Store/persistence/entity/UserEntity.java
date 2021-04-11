package com.VicioGames.Store.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/*@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "userId")*/
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "u_fname")
    private String uFName;

    @Column(name = "u_lname")
    private String uLName;

    @Column(name = "u_dninumbr")
    private Integer uDNINumbr;

    @Column(name = "u_dnitype")
    private String uDNIType;

    @Column(name = "u_birthdate")
    private LocalDateTime uBitrhDate;

    @Column(name = "u_regdate")
    private LocalDateTime uRegDate;

    @Column(name = "u_address")
    private String uAddress;

    @Column(name = "u_phonenumbr")
    private Long uPhoneNumbr;

    @Column(name = "u_email")
    private String uEmail;

    @Column(name = "u_password")
    private String uPassword;

    @Column(name = "u_status")
    private Boolean uStatus;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "role_id", updatable = false, insertable = false)
    private RoleEntity role;

    @OneToMany(mappedBy = "user")
    private List<PurchaseEntity> purchases;

    @OneToMany(mappedBy = "user")
    private List<CommentEntity> comments;

}
