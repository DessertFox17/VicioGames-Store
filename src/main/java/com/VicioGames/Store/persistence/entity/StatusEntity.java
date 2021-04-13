package com.VicioGames.Store.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.GenerationType;
import java.util.List;

@Entity
@Table(name = "status")
public class StatusEntity {

    //----------------TABLE COLUMNS---------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    private Integer pStatusId;

    @Column(name = "st_name")
    private String stName;

    //----------------RELATIONSHIPS---------------------------

    @OneToMany(mappedBy = "pStatus")
    private List<PurchaseEntity> pPurchases;

    //----------------GETTERS Y SETTERS ----------------------

    public Integer getpStatusId() {
        return pStatusId;
    }

    public void setpStatusId(Integer pStatusId) {
        this.pStatusId = pStatusId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public List<PurchaseEntity> getpPurchases() {
        return pPurchases;
    }

    public void setpPurchases(List<PurchaseEntity> pPurchases) {
        this.pPurchases = pPurchases;
    }
}
