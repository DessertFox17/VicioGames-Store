package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.CategoryDto;
import com.VicioGames.Store.domain.endpointdto.detailprodview.DetVCategoryDto;
import com.VicioGames.Store.persistence.entity.CategoryEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    //Mappers para crear categorías

    @InheritConfiguration
    @Mappings({
            @Mapping(source = "pCategoryId", target = "caId"),
            @Mapping(source = "catName", target = "name"),
            @Mapping(source = "catDescript", target = "description"),
            @Mapping(source = "catStatus", target = "status"),
    })
    CategoryDto toCategoryDto(CategoryEntity categoryEntity);

    @InheritInverseConfiguration
    @Mapping(target = "pSubcategories", ignore = true)
    CategoryEntity toCategoryEntity(CategoryDto categoryDto);

    //Mappers para consultar categorías

    @InheritConfiguration
    @Mappings({
            @Mapping(source = "catName", target = "name"),
            @Mapping(source = "catDescript", target = "description"),
    })
    DetVCategoryDto toDetVCategoryDto(CategoryEntity categoryEntity);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pCategoryId", ignore = true),
            @Mapping(target = "catStatus", ignore = true),
            @Mapping(target = "pSubcategories", ignore = true),
    })
    CategoryEntity toCategoryEntity(DetVCategoryDto getCategoryDto);
}
