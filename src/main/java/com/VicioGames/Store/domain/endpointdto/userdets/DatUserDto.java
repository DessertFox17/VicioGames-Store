package com.VicioGames.Store.domain.endpointdto.userdets;

import java.time.LocalDateTime;

public class DatUserDto {
    private int uId;
    private String firstName;
    private String lastName;
    private int idNumber;
    private String idType;
    private LocalDateTime bitrhDate;
    private String address;
    private long phoneNumber;
    private String email;

    //----------------GETTERS Y SETTERS ----------------------


    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
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
}
