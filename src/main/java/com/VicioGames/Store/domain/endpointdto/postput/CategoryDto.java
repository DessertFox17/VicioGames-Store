package com.VicioGames.Store.domain.endpointdto.postput;

public class CategoryDto {

    private int caId;
    private String name;
    private String description;
    private boolean status;

    //----------------GETTER AND SETTER--------------------------

    public int getCaId() {
        return caId;
    }

    public void setCaId(int caId) {
        this.caId = caId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
