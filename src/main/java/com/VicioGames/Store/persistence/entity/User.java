package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {

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
    private Integer uPhoneNumbr;

    @Column(name = "u_email")
    private String uEmail;

    @Column(name = "u_password")
    private String uPassword;

    @Column(name = "u_status")
    private Boolean uStatus;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "role_id",insertable = false,updatable = false)
    private Role role;

    //----------------SETTERS AND GETTERS---------------------


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getuFName() {
        return uFName;
    }

    public void setuFName(String uFName) {
        this.uFName = uFName;
    }

    public String getuLName() {
        return uLName;
    }

    public void setuLName(String uLName) {
        this.uLName = uLName;
    }

    public Integer getuDNINumbr() {
        return uDNINumbr;
    }

    public void setuDNINumbr(Integer uDNINumbr) {
        this.uDNINumbr = uDNINumbr;
    }

    public String getuDNIType() {
        return uDNIType;
    }

    public void setuDNIType(String uDNIType) {
        this.uDNIType = uDNIType;
    }

    public LocalDateTime getuBitrhDate() {
        return uBitrhDate;
    }

    public void setuBitrhDate(LocalDateTime uBitrhDate) {
        this.uBitrhDate = uBitrhDate;
    }

    public LocalDateTime getuRegDate() {
        return uRegDate;
    }

    public void setuRegDate(LocalDateTime uRegDate) {
        this.uRegDate = uRegDate;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public Integer getuPhoneNumbr() {
        return uPhoneNumbr;
    }

    public void setuPhoneNumbr(Integer uPhoneNumbr) {
        this.uPhoneNumbr = uPhoneNumbr;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Boolean getuStatus() {
        return uStatus;
    }

    public void setuStatus(Boolean uStatus) {
        this.uStatus = uStatus;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
