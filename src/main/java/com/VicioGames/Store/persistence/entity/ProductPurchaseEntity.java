package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;

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
    private ProductEntity productEntity;

    @ManyToOne
    @JoinColumn(name = "purchase_id", insertable = false, updatable = false)
    private PurchaseEntity purchaseEntity;

    //----------------SETTERS AND GETTERS---------------------

    public ProductPurchasePKEntity getId() {
        return id;
    }

    public void setId(ProductPurchasePKEntity id) {
        this.id = id;
    }

    public Integer getPpQuantity() {
        return ppQuantity;
    }

    public void setPpQuantity(Integer ppQuantity) {
        this.ppQuantity = ppQuantity;
    }

    public Double getPpTotSendCost() {
        return ppTotSendCost;
    }

    public void setPpTotSendCost(Double ppTotSendCost) {
        this.ppTotSendCost = ppTotSendCost;
    }

    public Double getPpTotProdsCost() {
        return ppTotProdsCost;
    }

    public void setPpTotProdsCost(Double ppTotProdsCost) {
        this.ppTotProdsCost = ppTotProdsCost;
    }

    public Double getPpPurchaseCost() {
        return ppPurchaseCost;
    }

    public void setPpPurchaseCost(Double ppPurchaseCost) {
        this.ppPurchaseCost = ppPurchaseCost;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public PurchaseEntity getPurchaseEntity() {
        return purchaseEntity;
    }

    public void setPurchaseEntity(PurchaseEntity purchaseEntity) {
        this.purchaseEntity = purchaseEntity;
    }
}
