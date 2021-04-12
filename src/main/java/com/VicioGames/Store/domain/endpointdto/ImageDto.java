package com.VicioGames.Store.domain.endpointdto;

public class ImageDto {

    private int id;
    private String URL;
    private ProductDto product;

    //----------------GETTER AND SETTER--------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }
}
