package com.VicioGames.Store.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "subcategoryId")
@Data
@Entity
@Table(name = "subcategory")
public class SubcategoryEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subcategory_id")
    private Integer subcategoryId;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_descript")
    private String sDescript;

    @Column(name = "s_Status")
    private Boolean sStatus;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryEntity category;

    @OneToMany(mappedBy = "subcategories")
    private List<ProductEntity> products;

}
