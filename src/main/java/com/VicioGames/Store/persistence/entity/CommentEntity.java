package com.VicioGames.Store.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "comment")
public class CommentEntity {

    //----------------TABLE COLUMNS-------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer pCommentId;

    @Column(name = "product_id")
    private Integer pProductId;

    @Column(name = "user_id")
    private Integer pUserId;

    @Column(name = "c_comment")
    private String cComment;

    @Column(name = "c_qualification")
    private Float cQualification;

    //----------------RELATIONSHIPS--------------------------

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity pProduct;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity pUser;

    //----------------GETTER AND SETTER--------------------------

    public Integer getpCommentId() {
        return pCommentId;
    }

    public void setpCommentId(Integer pCommentId) {
        this.pCommentId = pCommentId;
    }

    public Integer getpProductId() {
        return pProductId;
    }

    public void setpProductId(Integer pProductId) {
        this.pProductId = pProductId;
    }

    public Integer getpUserId() {
        return pUserId;
    }

    public void setpUserId(Integer pUserId) {
        this.pUserId = pUserId;
    }

    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment;
    }

    public Float getcQualification() {
        return cQualification;
    }

    public void setcQualification(Float cQualification) {
        this.cQualification = cQualification;
    }

    public ProductEntity getpProduct() {
        return pProduct;
    }

    public void setpProduct(ProductEntity pProduct) {
        this.pProduct = pProduct;
    }

    public UserEntity getpUser() {
        return pUser;
    }

    public void setpUser(UserEntity pUser) {
        this.pUser = pUser;
    }
}
