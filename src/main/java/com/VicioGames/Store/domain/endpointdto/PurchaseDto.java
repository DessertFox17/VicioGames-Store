package com.VicioGames.Store.domain.endpointdto;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseDto {
    private int puId;
    private int stId;
    private int uId;
    private LocalDateTime date;
    private String payMeth;
    private String comment;
    private List<ProductPurchaseDto> products;
    private StatusDto status;

    //----------------GETTER AND SETTER--------------------------


    public int getPuId() {
        return puId;
    }

    public void setPuId(int puId) {
        this.puId = puId;
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPayMeth() {
        return payMeth;
    }

    public void setPayMeth(String payMeth) {
        this.payMeth = payMeth;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<ProductPurchaseDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductPurchaseDto> products) {
        this.products = products;
    }

    public StatusDto getStatus() {
        return status;
    }

    public void setStatus(StatusDto status) {
        this.status = status;
    }
}
