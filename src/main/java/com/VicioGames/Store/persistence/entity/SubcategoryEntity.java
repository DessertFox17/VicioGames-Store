package com.VicioGames.Store.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.List;

@Entity
@Table(name = "subcategory")
public class SubcategoryEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subcategory_id")
    private Integer pSubcategoryId;

    @Column(name = "category_id")
    private Integer pCategoryId;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_descript")
    private String sDescript;

    @Column(name = "s_Status")
    private Boolean sStatus;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryEntity pCategory;

    @OneToMany(mappedBy = "pSubcategory")
    private List<ProductEntity> pProducts;

    //----------------GETTERS Y SETTERS ----------------------

    public Integer getpSubcategoryId() {
        return pSubcategoryId;
    }

    public void setpSubcategoryId(Integer pSubcategoryId) {
        this.pSubcategoryId = pSubcategoryId;
    }

    public Integer getpCategoryId() {
        return pCategoryId;
    }

    public void setpCategoryId(Integer pCategoryId) {
        this.pCategoryId = pCategoryId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsDescript() {
        return sDescript;
    }

    public void setsDescript(String sDescript) {
        this.sDescript = sDescript;
    }

    public Boolean getsStatus() {
        return sStatus;
    }

    public void setsStatus(Boolean sStatus) {
        this.sStatus = sStatus;
    }

    public CategoryEntity getpCategory() {
        return pCategory;
    }

    public void setpCategory(CategoryEntity pCategory) {
        this.pCategory = pCategory;
    }

    public List<ProductEntity> getpProducts() {
        return pProducts;
    }

    public void setpProducts(List<ProductEntity> pProducts) {
        this.pProducts = pProducts;
    }
}
