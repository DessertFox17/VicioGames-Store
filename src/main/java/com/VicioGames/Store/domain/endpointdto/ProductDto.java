package com.VicioGames.Store.domain.endpointdto;

import java.time.LocalDateTime;
import java.util.List;

public class ProductDto {

    private int prId;
    private int sId;
    private String name;
    private double price;
    private int stock;
    private double shipCost;
    private String tumbnail;
    private LocalDateTime publicDate;
    private String description;
    private String details;
    private int searchCounter;
    private boolean status;
    private SubcategoryDto subcategory;
    // private List<CategoryDto> images;
    private List<CommentDto> comments;
    //private List<PurchaseDto> purchases;*/

    //----------------GETTER AND SETTER--------------------------


    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getShipCost() {
        return shipCost;
    }

    public void setShipCost(double shipCost) {
        this.shipCost = shipCost;
    }

    public String getTumbnail() {
        return tumbnail;
    }

    public void setTumbnail(String tumbnail) {
        this.tumbnail = tumbnail;
    }

    public LocalDateTime getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(LocalDateTime publicDate) {
        this.publicDate = publicDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getSearchCounter() {
        return searchCounter;
    }

    public void setSearchCounter(int searchCounter) {
        this.searchCounter = searchCounter;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public SubcategoryDto getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(SubcategoryDto subcategory) {
        this.subcategory = subcategory;
    }

/*    public List<CategoryDto> getImages() {
        return images;
    }

    public void setImages(List<CategoryDto> images) {
        this.images = images;
    }*/

    public List<CommentDto> getComments() {
        return comments;
    }

    public void setComments(List<CommentDto> comments) {
        this.comments = comments;
    }

/*    public List<PurchaseDto> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<PurchaseDto> purchases) {
        this.purchases = purchases;
    }*/
}
