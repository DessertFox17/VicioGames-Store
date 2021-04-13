package com.VicioGames.Store.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductPurchasePKEntity implements Serializable {

    //---------------- FOREING KEYS ------------------------------

    @Column(name = "product_id")
    private Integer pProductId;

    @Column(name = "purchase_id")
    private Integer pPurchaseId;

    //----------------GETTER AND SETTER--------------------------

    public Integer getpProductId() {
        return pProductId;
    }

    public void setpProductId(Integer pProductId) {
        this.pProductId = pProductId;
    }

    public Integer getpPurchaseId() {
        return pPurchaseId;
    }

    public void setpPurchaseId(Integer pPurchaseId) {
        this.pPurchaseId = pPurchaseId;
    }
}
