package com.VicioGames.Store.domain.endpointdto.get;

public class GetSubcategoryDto {

    private String name;
    private String description;
    private GetCategoryDto category;

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

    public GetCategoryDto getCategory() {
        return category;
    }

    public void setCategory(GetCategoryDto category) {
        this.category = category;
    }
}
