package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "Product_Purchase")
public class ProductPurchase {

    //----------------TABLE COLUMNS---------------------------

    @EmbeddedId
    private ProductPurchasePK id;

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
    private Product product;

    @ManyToOne
    @JoinColumn(name = "purchase_id", insertable = false, updatable = false)
    private Purchase purchase;

    //----------------SETTERS AND GETTERS---------------------


    public ProductPurchasePK getId() {
        return id;
    }

    public void setId(ProductPurchasePK id) {
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
}
