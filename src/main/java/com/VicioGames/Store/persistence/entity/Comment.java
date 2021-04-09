package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer commentId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "c_comment")
    private String cComment;

    @Column(name = "c_qualification")
    private Float cQualification;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
}
