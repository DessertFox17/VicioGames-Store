package com.VicioGames.Store.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "product")
public class ProductEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer pProductId;

    @Column(name = "subcategory_id")
    private Integer pSubcategoryId;

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
    private SubcategoryEntity pSubcategory;

    @OneToMany(mappedBy = "pProduct" )
    private List<ImageEntity> pImages;

    @OneToMany(mappedBy = "pProduct" )
    private List<CommentEntity> pComments;

    @OneToMany(mappedBy = "pProduct")
    private List<ProductPurchaseEntity> pPurchases;

    //----------------GETTER AND SETTER--------------------------

    public Integer getpProductId() {
        return pProductId;
    }

    public void setpProductId(Integer pProductId) {
        this.pProductId = pProductId;
    }

    public Integer getpSubcategoryId() {
        return pSubcategoryId;
    }

    public void setpSubcategoryId(Integer pSubcategoryId) {
        this.pSubcategoryId = pSubcategoryId;
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

    public SubcategoryEntity getpSubcategory() {
        return pSubcategory;
    }

    public void setpSubcategory(SubcategoryEntity pSubcategory) {
        this.pSubcategory = pSubcategory;
    }

    public List<ImageEntity> getpImages() {
        return pImages;
    }

    public void setpImages(List<ImageEntity> pImages) {
        this.pImages = pImages;
    }

    public List<CommentEntity> getpComments() {
        return pComments;
    }

    public void setpComments(List<CommentEntity> pComments) {
        this.pComments = pComments;
    }

    public List<ProductPurchaseEntity> getpPurchases() {
        return pPurchases;
    }

    public void setpPurchases(List<ProductPurchaseEntity> pPurchases) {
        this.pPurchases = pPurchases;
    }
}
