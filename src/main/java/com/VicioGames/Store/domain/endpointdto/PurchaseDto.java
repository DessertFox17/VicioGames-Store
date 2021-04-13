package com.VicioGames.Store.domain.endpointdto;

import com.VicioGames.Store.persistence.entity.ProductPurchaseEntity;
import com.VicioGames.Store.persistence.entity.StatusEntity;
import com.VicioGames.Store.persistence.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseDto {

    private int purchaseId;
    private int statusId;
    private int userId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private StatusEntity status;
    private UserEntity user;
    private List<ProductPurchaseEntity> products;

    //----------------GETTER AND SETTER--------------------------


    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public List<ProductPurchaseEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductPurchaseEntity> products) {
        this.products = products;
    }
}
