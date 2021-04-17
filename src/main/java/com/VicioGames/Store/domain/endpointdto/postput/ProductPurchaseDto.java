package com.VicioGames.Store.domain.endpointdto.postput;

public class ProductPurchaseDto {

    private int prId;
    private int quantity;
    private double totProductsCost;
    private double totShipCost;
    private double purchaseCost;

    //----------------GETTER AND SETTER--------------------------


    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotProductsCost() {
        return totProductsCost;
    }

    public void setTotProductsCost(double totProductsCost) {
        this.totProductsCost = totProductsCost;
    }

    public double getTotShipCost() {
        return totShipCost;
    }

    public void setTotShipCost(double totShipCost) {
        this.totShipCost = totShipCost;
    }

    public double getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(double purchaseCost) {
        this.purchaseCost = purchaseCost;
    }
}
