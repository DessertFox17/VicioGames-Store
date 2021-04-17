package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.GetProductDto;
import com.VicioGames.Store.domain.endpointdto.ProductDto;
import com.VicioGames.Store.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CommentMapper.class,ImageMapper.class,SubcategoryMapper.class, PurchaseMapper.class})
public interface GetProductMapper {

    @Mappings({
            @Mapping(source = "prName",target = "name"),
            @Mapping(source = "prPrice",target = "price"),
            @Mapping(source = "prSendcost",target = "shipCost"),
            @Mapping(source = "prDescript",target = "description"),
            @Mapping(source = "prDetails",target = "details"),
            @Mapping(source = "pComments",target = "comments"),
    })
    GetProductDto toGetProductDto(ProductEntity productEntity);
    List<ProductDto> toGetProductsDto(List<ProductEntity> productsList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pProductId", ignore = true),
            @Mapping(target = "pSubcategoryId", ignore = true),
            @Mapping(target = "prStock", ignore = true),
            @Mapping(target = "prTumbnail", ignore = true),
            @Mapping(target = "prPublicdate", ignore = true),
            @Mapping(target = "prSearchCount", ignore = true),
            @Mapping(target = "prStatus", ignore = true),
            @Mapping(target = "pSubcategory", ignore = true),
            @Mapping(target = "pImages", ignore = true),
            @Mapping(target = "pPurchases", ignore = true),
    })
    ProductEntity toProductEntityGet(GetProductDto getProductDto);
}
