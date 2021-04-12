package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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

    //----------------GETTER AND SETTER--------------------------


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Integer subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }

    public Double getPrPrice() {
        return prPrice;
    }

    public void setPrPrice(Double prPrice) {
        this.prPrice = prPrice;
    }

    public Integer getPrStock() {
        return prStock;
    }

    public void setPrStock(Integer prStock) {
        this.prStock = prStock;
    }

    public Double getPrSendcost() {
        return prSendcost;
    }

    public void setPrSendcost(Double prSendcost) {
        this.prSendcost = prSendcost;
    }

    public String getPrTumbnail() {
        return prTumbnail;
    }

    public void setPrTumbnail(String prTumbnail) {
        this.prTumbnail = prTumbnail;
    }

    public LocalDateTime getPrPublicdate() {
        return prPublicdate;
    }

    public void setPrPublicdate(LocalDateTime prPublicdate) {
        this.prPublicdate = prPublicdate;
    }

    public String getPrDescript() {
        return prDescript;
    }

    public void setPrDescript(String prDescript) {
        this.prDescript = prDescript;
    }

    public String getPrDetails() {
        return prDetails;
    }

    public void setPrDetails(String prDetails) {
        this.prDetails = prDetails;
    }

    public Integer getPrSearchCount() {
        return prSearchCount;
    }

    public void setPrSearchCount(Integer prSearchCount) {
        this.prSearchCount = prSearchCount;
    }

    public Boolean getPrStatus() {
        return prStatus;
    }

    public void setPrStatus(Boolean prStatus) {
        this.prStatus = prStatus;
    }

    public SubcategoryEntity getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(SubcategoryEntity subcategories) {
        this.subcategories = subcategories;
    }

    public List<ImageEntity> getImages() {
        return images;
    }

    public void setImages(List<ImageEntity> images) {
        this.images = images;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    public List<ProductPurchaseEntity> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<ProductPurchaseEntity> purchases) {
        this.purchases = purchases;
    }
}
