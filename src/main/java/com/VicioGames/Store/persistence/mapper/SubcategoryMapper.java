package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.SubcategoryDto;
import com.VicioGames.Store.persistence.entity.SubcategoryEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface SubcategoryMapper {

    @Mappings({
            @Mapping(source = "pSubcategoryId", target = "sId"),
            @Mapping(source = "pCategoryId", target = "cId"),
            @Mapping(source = "sName", target = "name"),
            @Mapping(source = "sDescript", target = "description"),
            @Mapping(source = "sStatus", target = "status"),
            //@Mapping(source = "pCategory", target = "category"),
    })
    SubcategoryDto toSubcategoryDto(SubcategoryEntity subcategoryEntity);

    List<SubcategoryDto> toSubcategoriesDto(List<SubcategoryEntity> subcategoriesList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pProducts", ignore = true),
            @Mapping(target = "pCategory", ignore = true)
    })

    SubcategoryEntity SubcategoryEntity(SubcategoryDto subcategoryDto);


}
