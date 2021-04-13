package com.VicioGames.Store.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer pCategoryId;

    @Column(name = "cat_name")
    private String catName;

    @Column(name = "cat_descript")
    private String catDescript;

    @Column(name = "cat_status")
    private Boolean catStatus;

    //----------------RELATIONSHIPS--------------------------

    @OneToMany(mappedBy = "pCategory")
    private List<SubcategoryEntity> pSubcategories;

    //----------------GETTER AND SETTER--------------------------

    public Integer getpCategoryId() {
        return pCategoryId;
    }

    public void setpCategoryId(Integer pCategoryId) {
        this.pCategoryId = pCategoryId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDescript() {
        return catDescript;
    }

    public void setCatDescript(String catDescript) {
        this.catDescript = catDescript;
    }

    public Boolean getCatStatus() {
        return catStatus;
    }

    public void setCatStatus(Boolean catStatus) {
        this.catStatus = catStatus;
    }

    public List<SubcategoryEntity> getpSubcategories() {
        return pSubcategories;
    }

    public void setpSubcategories(List<SubcategoryEntity> pSubcategories) {
        this.pSubcategories = pSubcategories;
    }
}
