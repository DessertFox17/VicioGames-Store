package com.VicioGames.Store.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "purchaseId")
@Data
@Entity
@Table(name = "purchase")
public class PurchaseEntity {

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
    private StatusEntity status;

    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false, updatable = false)
    private UserEntity user;

    @OneToMany(mappedBy = "purchase")
    private List<ProductPurchaseEntity> products;

}
