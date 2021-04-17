package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name = "purchase")
public class PurchaseEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Purchase_id")
    private Integer pPurchaseId;

    @Column(name = "status_id")
    private Integer pStatusId;

    @Column(name = "user_id")
    private Integer pUserId;

    @Column(name = "p_date")
    private LocalDateTime pDate;

    @Column(name = "p_paymeth")
    private String pPayMeth;

    @Column(name = "p_comment")
    private String pComment;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "status_id", insertable = false, updatable = false)
    private StatusEntity pStatus;

    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false, updatable = false)
    private UserEntity pUser;

    @OneToMany(mappedBy = "pPurchase", cascade = {CascadeType.ALL})
    private List<ProductPurchaseEntity> pProducts;

    //----------------GETTER AND SETTER--------------------------

    public Integer getpPurchaseId() {
        return pPurchaseId;
    }

    public void setpPurchaseId(Integer pPurchaseId) {
        this.pPurchaseId = pPurchaseId;
    }

    public Integer getpStatusId() {
        return pStatusId;
    }

    public void setpStatusId(Integer pStatusId) {
        this.pStatusId = pStatusId;
    }

    public Integer getpUserId() {
        return pUserId;
    }

    public void setpUserId(Integer pUserId) {
        this.pUserId = pUserId;
    }

    public LocalDateTime getpDate() {
        return pDate;
    }

    public void setpDate(LocalDateTime pDate) {
        this.pDate = pDate;
    }

    public String getpPayMeth() {
        return pPayMeth;
    }

    public void setpPayMeth(String pPayMeth) {
        this.pPayMeth = pPayMeth;
    }

    public String getpComment() {
        return pComment;
    }

    public void setpComment(String pComment) {
        this.pComment = pComment;
    }

    public StatusEntity getpStatus() {
        return pStatus;
    }

    public void setpStatus(StatusEntity pStatus) {
        this.pStatus = pStatus;
    }

    public UserEntity getpUser() {
        return pUser;
    }

    public void setpUser(UserEntity pUser) {
        this.pUser = pUser;
    }

    public List<ProductPurchaseEntity> getpProducts() {
        return pProducts;
    }

    public void setpProducts(List<ProductPurchaseEntity> pProducts) {
        this.pProducts = pProducts;
    }
}
