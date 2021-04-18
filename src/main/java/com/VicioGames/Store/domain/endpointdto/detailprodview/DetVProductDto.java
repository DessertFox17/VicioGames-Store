package com.VicioGames.Store.domain.endpointdto.detailprodview;

import java.time.LocalDateTime;
import java.util.List;

public class DetVProductDto {
    private int prId;
    private String name;
    private double price;
    private int stock;
    private double shipCost;
    private String tumbnail;
    private LocalDateTime publicationDate;
    private String description;
    private String details;
    private DetVSubcategoryDto subcategory;
    private List<DetVtImageDto> images;
    private List<DetVCommentDto> comments;

    //----------------GETTER AND SETTER--------------------------

    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
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

    public LocalDateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDateTime publicationDate) {
        this.publicationDate = publicationDate;
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

    public DetVSubcategoryDto getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(DetVSubcategoryDto subcategory) {
        this.subcategory = subcategory;
    }

    public List<DetVtImageDto> getImages() {
        return images;
    }

    public void setImages(List<DetVtImageDto> images) {
        this.images = images;
    }

    public List<DetVCommentDto> getComments() {
        return comments;
    }

    public void setComments(List<DetVCommentDto> comments) {
        this.comments = comments;
    }
}
