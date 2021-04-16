package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class ImageEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Integer pImageId;

    @Column(name = "product_id")
    private Integer pProductId;

    @Column(name = "i_url")
    private String iURL;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity pProduct;

    //----------------GETTER AND SETTER--------------------------


    public Integer getpImageId() {
        return pImageId;
    }

    public void setpImageId(Integer pImageId) {
        this.pImageId = pImageId;
    }

    public Integer getpProductId() {
        return pProductId;
    }

    public void setpProductId(Integer pProductId) {
        this.pProductId = pProductId;
    }

    public String getiURL() {
        return iURL;
    }

    public void setiURL(String iURL) {
        this.iURL = iURL;
    }

    public ProductEntity getpProduct() {
        return pProduct;
    }

    public void setpProduct(ProductEntity pProduct) {
        this.pProduct = pProduct;
    }
}
