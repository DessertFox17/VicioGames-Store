package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.get.GetSubcategoryDto;
import com.VicioGames.Store.domain.endpointdto.postput.SubcategoryDto;
import com.VicioGames.Store.persistence.entity.SubcategoryEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = CategoryMapper.class)
public interface SubcategoryMapper {

    //Mappers para creación de subcategorías

    @InheritConfiguration
    @Mappings({
            @Mapping(source = "pSubcategoryId", target = "sId"),
            @Mapping(source = "pCategoryId", target = "cId"),
            @Mapping(source = "sName", target = "name"),
            @Mapping(source = "sDescript", target = "description"),
            @Mapping(source = "sStatus", target = "status"),
    })
    SubcategoryDto toSubcategoryDto(SubcategoryEntity subcategoryEntity);

    List<SubcategoryDto> toSubcategoriesDto(List<SubcategoryEntity> subcategoriesList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pProducts", ignore = true),
            @Mapping(target = "pCategory", ignore = true),
    })

    SubcategoryEntity SubcategoryEntity(SubcategoryDto subcategoryDto);

    //Mappers para Consulta de subcategorias

    @InheritConfiguration
    @Mappings({
            @Mapping(source = "sName", target = "name"),
            @Mapping(source = "sDescript", target = "description"),
            @Mapping(source = "pCategory", target = "category"),
    })
    GetSubcategoryDto toGetSubcategoryDto(SubcategoryEntity subcategoryEntity);
    List<GetSubcategoryDto> toGetSubcategoriesDto(List<SubcategoryEntity> getSubcategoriesList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pSubcategoryId", ignore = true),
            @Mapping(target = "pCategoryId", ignore = true),
            @Mapping(target = "sStatus", ignore = true),
            @Mapping(target = "pProducts", ignore = true),
    })
    SubcategoryEntity toGetSubcategoryEntity(GetSubcategoryDto getSubcategoryDto);

}
