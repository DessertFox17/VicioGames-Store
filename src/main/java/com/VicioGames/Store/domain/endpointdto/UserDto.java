package com.VicioGames.Store.domain.endpointdto;

import java.time.LocalDateTime;
import java.util.List;

public class UserDto {

    private int userId;
    private int roleId;
    private String firstName;
    private String lastName;
    private int idNumber;
    private String idType;
    private LocalDateTime bitrhDate;
    private LocalDateTime createdDate;
    private String address;
    private long phoneNumber;
    private String email;
    private String password;
    private boolean status;
    private RoleDto role;
    private List<PurchaseDto> purchases;
    private List<CommentDto> comments;

    //----------------GETTERS Y SETTERS ----------------------


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public LocalDateTime getBitrhDate() {
        return bitrhDate;
    }

    public void setBitrhDate(LocalDateTime bitrhDate) {
        this.bitrhDate = bitrhDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public RoleDto getRole() {
        return role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }

    public List<PurchaseDto> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<PurchaseDto> purchases) {
        this.purchases = purchases;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public void setComments(List<CommentDto> comments) {
        this.comments = comments;
    }
}
