package com.VicioGames.Store.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "product_purchase")
public class ProductPurchaseEntity {

    //----------------TABLE COLUMNS---------------------------

    @EmbeddedId
    private ProductPurchasePKEntity id;

    @Column(name = "pp_quantity")
    private Integer ppQuantity;

    @Column(name = "pp_totsendcost")
    private Double ppTotSendCost;

    @Column(name = "pp_totprodscost")
    private Double ppTotProdsCost;

    @Column(name = "pp_purchasecost")
    private Double ppPurchaseCost;

    //----------------RELATIONSHIPS---------------------------

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity product;

    @ManyToOne
    @JoinColumn(name = "purchase_id", insertable = false, updatable = false)
    private PurchaseEntity purchase;

}
