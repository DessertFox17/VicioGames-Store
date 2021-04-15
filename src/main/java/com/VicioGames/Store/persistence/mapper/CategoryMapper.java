package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.CategoryDto;
import com.VicioGames.Store.persistence.entity.CategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

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
}
