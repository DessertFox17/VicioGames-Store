package com.VicioGames.Store.domain.endpointdto;

public class CommentDto {

    private int commentId;
    private int productId;
    private int userId;
    private String comment;
    private float quialification;
    private ProductDto product;
    private UserDto user;

    //----------------GETTER AND SETTER--------------------------


    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getQuialification() {
        return quialification;
    }

    public void setQuialification(float quialification) {
        this.quialification = quialification;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
