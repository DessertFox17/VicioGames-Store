package com.VicioGames.Store.persistence.mapper;


import com.VicioGames.Store.domain.endpointdto.ProductDto;
import com.VicioGames.Store.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SubcategoryMapper.class, CommentMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "pProductId", target = "prId"),
            @Mapping(source = "pSubcategoryId", target = "sId"),
            @Mapping(source = "prName", target = "name"),
            @Mapping(source = "prPrice", target = "price"),
            @Mapping(source = "prStock", target = "stock"),
            @Mapping(source = "prSendcost", target = "shipCost"),
            @Mapping(source = "prTumbnail", target = "tumbnail"),
            @Mapping(source = "prPublicdate", target = "publicDate"),
            @Mapping(source = "prDescript", target = "description"),
            @Mapping(source = "prDetails", target = "details"),
            @Mapping(source = "prSearchCount", target = "searchCounter"),
            @Mapping(source = "prStatus", target = "status"),
            @Mapping(source = "pSubcategory", target = "subcategory"),
            @Mapping(source = "pImages", target = "images"),
            @Mapping(source = "pComments", target = "comments"),
    })
    ProductDto toProductDto(ProductEntity productEntity);

    List<ProductDto> toProductsDto(List<ProductEntity> productsList);

    @InheritInverseConfiguration
    @Mapping(target = "pPurchases", ignore = true)
    ProductEntity toProductEntity(ProductDto productDto);
}
