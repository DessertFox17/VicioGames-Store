package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity {

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
    @MapsId("roleId")
    @JoinColumn(name = "role_id", updatable = false, insertable = false)
    private RoleEntity roleEntity;

    @OneToMany(mappedBy = "user")
    private List<PurchaseEntity> purchaseEntities;

    @OneToMany(mappedBy = "user")
    private List<CommentEntity> commentEntities;

    //----------------GETTERS Y SETTERS ----------------------


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

    public Long getuPhoneNumbr() {
        return uPhoneNumbr;
    }

    public void setuPhoneNumbr(Long uPhoneNumbr) {
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

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    public List<PurchaseEntity> getPurchaseEntities() {
        return purchaseEntities;
    }

    public void setPurchaseEntities(List<PurchaseEntity> purchaseEntities) {
        this.purchaseEntities = purchaseEntities;
    }

    public List<CommentEntity> getCommentEntities() {
        return commentEntities;
    }

    public void setCommentEntities(List<CommentEntity> commentEntities) {
        this.commentEntities = commentEntities;
    }
}
