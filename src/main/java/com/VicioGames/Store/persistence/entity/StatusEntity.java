package com.VicioGames.Store.persistence.entity;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "statusEntity")
    private List<PurchaseEntity> purchaseEntities;

    //----------------SETTERS AND GETTERS---------------------

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public List<PurchaseEntity> getPurchaseEntities() {
        return purchaseEntities;
    }

    public void setPurchaseEntities(List<PurchaseEntity> purchaseEntities) {
        this.purchaseEntities = purchaseEntities;
    }
}
