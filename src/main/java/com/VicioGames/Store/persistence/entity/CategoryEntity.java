package com.VicioGames.Store.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "categoryId")
@Data
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
    @JsonBackReference
    @OneToMany(mappedBy = "category")
    private List<SubcategoryEntity> subcategories;

}
