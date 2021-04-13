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
    private ProductPurchasePKEntity pId;

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
    private ProductEntity pProduct;

    @ManyToOne
    @JoinColumn(name = "purchase_id", insertable = false, updatable = false)
    private PurchaseEntity pPurchase;

    //----------------GETTER AND SETTER--------------------------

    public ProductPurchasePKEntity getpId() {
        return pId;
    }

    public void setpId(ProductPurchasePKEntity pId) {
        this.pId = pId;
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

    public ProductEntity getpProduct() {
        return pProduct;
    }

    public void setpProduct(ProductEntity pProduct) {
        this.pProduct = pProduct;
    }

    public PurchaseEntity getpPurchase() {
        return pPurchase;
    }

    public void setpPurchase(PurchaseEntity pPurchase) {
        this.pPurchase = pPurchase;
    }
}
