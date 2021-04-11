package com.VicioGames.Store.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "productId")
@Data
@Entity
@Table(name = "product")
public class ProductEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "subcategory_id")
    private Integer subcategoryId;

    @Column(name = "pr_name")
    private String prName;

    @Column(name = "pr_price")
    private Double prPrice;

    @Column(name = "pr_stock")
    private Integer prStock;

    @Column(name = "pr_sendcost")
    private Double prSendcost;

    @Column(name = "pr_tumbnail")
    private String prTumbnail;

    @Column(name = "pr_publicdate")
    private LocalDateTime prPublicdate;

    @Column(name = "pr_descript")
    private String prDescript;

    @Column(name = "pr_details")
    private String prDetails;

    @Column(name = "pr_searchcount")
    private Integer prSearchCount;

    @Column(name = "pr_status")
    private Boolean prStatus;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "subcategory_id", insertable = false, updatable = false)
    private SubcategoryEntity subcategories;

    @OneToMany(mappedBy = "product" )
    private List<ImageEntity> images;

    @OneToMany(mappedBy = "product" )
    private List<CommentEntity> comments;

    @OneToMany(mappedBy = "product")
    private List<ProductPurchaseEntity> purchases;


}
