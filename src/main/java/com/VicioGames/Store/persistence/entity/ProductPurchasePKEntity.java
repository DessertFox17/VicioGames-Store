package com.VicioGames.Store.persistence.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class ProductPurchasePKEntity implements Serializable {

    //---------------- FOREING KEYS ------------------------------

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "purchase_id")
    private Integer purchaseId;

}
