package com.VicioGames.Store.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductPurchasePKEntity implements Serializable {

    //---------------- FOREING KEYS ------------------------------

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "purchase_id")
    private Integer purchaseId;

    //----------------SETTER y GETTER ---------------------------


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }
}
