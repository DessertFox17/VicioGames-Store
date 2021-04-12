package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class ImageEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Integer imageId;

    @Column(name = "i_URL")
    private String iURL;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity product;

    //----------------GETTER AND SETTER--------------------------


    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getiURL() {
        return iURL;
    }

    public void setiURL(String iURL) {
        this.iURL = iURL;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
