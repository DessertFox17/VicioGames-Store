package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "cat_name")
    private String catName;

    @Column(name = "cat_descript")
    private String catDescript;

    @Column(name = "cat_status")
    private Boolean catStatus;

    //----------------RELATIONSHIPS--------------------------

    @OneToMany(mappedBy = "categoryEntity")
    private List<SubcategoryEntity> subcategoryEntities;

    //----------------SETTERS AND GETTERS---------------------

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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

    public List<SubcategoryEntity> getSubcategoryEntities() {
        return subcategoryEntities;
    }

    public void setSubcategoryEntities(List<SubcategoryEntity> subcategoryEntities) {
        this.subcategoryEntities = subcategoryEntities;
    }
}