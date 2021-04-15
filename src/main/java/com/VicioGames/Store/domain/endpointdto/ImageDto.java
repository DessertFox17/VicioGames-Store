package com.VicioGames.Store.domain.endpointdto;

public class ImageDto {
    private int iId;
    private String URL;
    private ProductDto productDto;

    //----------------GETTER AND SETTER--------------------------

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public ProductDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductDto productDto) {
        this.productDto = productDto;
    }
}
