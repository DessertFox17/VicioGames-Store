package com.VicioGames.Store.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "statusId")
@Data
@Entity
@Table(name = "status")
public class StatusEntity {

    //----------------TABLE COLUMNS---------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    private Integer statusId;

    @Column(name = "st_name")
    private String stName;

    //----------------RELATIONSHIPS---------------------------

    @OneToMany(mappedBy = "status")
    private List<PurchaseEntity> purchases;

}
