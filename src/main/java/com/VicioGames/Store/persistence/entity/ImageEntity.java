package com.VicioGames.Store.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "image")
public class ImageEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Integer pImageId;

    @Column(name = "i_URL")
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
