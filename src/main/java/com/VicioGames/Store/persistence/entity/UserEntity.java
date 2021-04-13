package com.VicioGames.Store.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer pUserId;

    @Column(name = "role_id")
    private Integer pRoleId;

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
    private RoleEntity pRole;

    @OneToMany(mappedBy = "pUser")
    private List<PurchaseEntity> pPurchases;

    @OneToMany(mappedBy = "pUser")
    private List<CommentEntity> pComments;

    //----------------GETTERS Y SETTERS ----------------------

    public Integer getpUserId() {
        return pUserId;
    }

    public void setpUserId(Integer pUserId) {
        this.pUserId = pUserId;
    }

    public Integer getpRoleId() {
        return pRoleId;
    }

    public void setpRoleId(Integer pRoleId) {
        this.pRoleId = pRoleId;
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

    public RoleEntity getpRole() {
        return pRole;
    }

    public void setpRole(RoleEntity pRole) {
        this.pRole = pRole;
    }

    public List<PurchaseEntity> getpPurchases() {
        return pPurchases;
    }

    public void setpPurchases(List<PurchaseEntity> pPurchases) {
        this.pPurchases = pPurchases;
    }

    public List<CommentEntity> getpComments() {
        return pComments;
    }

    public void setpComments(List<CommentEntity> pComments) {
        this.pComments = pComments;
    }
}
