package com.VicioGames.Store.domain.endpointdto.get;

public class GetCategoryDto {

    private String name;
    private String description;

    //----------------GETTERS Y SETTERS ----------------------


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
}
