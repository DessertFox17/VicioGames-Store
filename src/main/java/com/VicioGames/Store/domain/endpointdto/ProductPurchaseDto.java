package com.VicioGames.Store.domain.endpointdto;

import com.VicioGames.Store.persistence.entity.ProductEntity;
import com.VicioGames.Store.persistence.entity.PurchaseEntity;

public class ProductPurchaseDto {

    private int productId;
    private int purchaseId;
    private int quantity;
    private double totalShipCost;
    private double totalProductsCost;
    private double totalPurchaseCost;
    private ProductEntity products;
    private PurchaseEntity purchases;

    //----------------GETTER AND SETTER--------------------------

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalShipCost() {
        return totalShipCost;
    }

    public void setTotalShipCost(double totalShipCost) {
        this.totalShipCost = totalShipCost;
    }

    public double getTotalProductsCost() {
        return totalProductsCost;
    }

    public void setTotalProductsCost(double totalProductsCost) {
        this.totalProductsCost = totalProductsCost;
    }

    public double getTotalPurchaseCost() {
        return totalPurchaseCost;
    }

    public void setTotalPurchaseCost(double totalPurchaseCost) {
        this.totalPurchaseCost = totalPurchaseCost;
    }

    public ProductEntity getProducts() {
        return products;
    }

    public void setProducts(ProductEntity products) {
        this.products = products;
    }

    public PurchaseEntity getPurchases() {
        return purchases;
    }

    public void setPurchases(PurchaseEntity purchases) {
        this.purchases = purchases;
    }
}
