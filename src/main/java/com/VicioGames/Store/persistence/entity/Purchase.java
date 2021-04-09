package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Purchase {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_id")
    private Integer purchaseId;

    @Column(name = "status_id")
    private Integer statusId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "p_date")
    private LocalDateTime pDate;

    @Column(name = "p_paymeth")
    private String pPayMeth;

    @Column(name = "p_comment")
    private String pComment;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "status_id", insertable = false, updatable = false)
    private Status status;

    //----------------SETTERS AND GETTERS---------------------

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
