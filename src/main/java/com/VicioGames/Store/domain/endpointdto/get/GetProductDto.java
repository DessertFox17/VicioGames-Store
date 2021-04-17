package com.VicioGames.Store.domain.endpointdto.get;

import com.VicioGames.Store.domain.endpointdto.postput.CommentDto;
import com.VicioGames.Store.domain.endpointdto.postput.ImageDto;

import java.time.LocalDateTime;
import java.util.List;

public class GetProductDto {
    private String name;
    private double price;
    private int stock;
    private double shipCost;
    private String tumbnail;
    private LocalDateTime publicationDate;
    private String description;
    private String details;
    private GetSubcategoryDto subcategory;
    private List<ImageDto> images;
    private List<CommentDto> comments;

    //----------------GETTER AND SETTER--------------------------

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

    public GetSubcategoryDto getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(GetSubcategoryDto subcategory) {
        this.subcategory = subcategory;
    }

    public List<ImageDto> getImages() {
        return images;
    }

    public void setImages(List<ImageDto> images) {
        this.images = images;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public void setComments(List<CommentDto> comments) {
        this.comments = comments;
    }
}
