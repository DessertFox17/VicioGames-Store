package com.VicioGames.Store.domain.endpointdto.detailprodview;

public class DetVSubcategoryDto {

    private String name;
    private String description;
    private DetVCategoryDto category;

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

    public DetVCategoryDto getCategory() {
        return category;
    }

    public void setCategory(DetVCategoryDto category) {
        this.category = category;
    }
}
