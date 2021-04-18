package com.VicioGames.Store.persistence.mapper;


import com.VicioGames.Store.domain.endpointdto.ProductDto;
import com.VicioGames.Store.domain.endpointdto.detailprodview.DetVProductDto;
import com.VicioGames.Store.domain.endpointdto.smartfilter.SmartProuctDto;
import com.VicioGames.Store.persistence.entity.ProductEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SubcategoryMapper.class, CommentMapper.class, ImageMapper.class})
public interface ProductMapper {

    //MAPPERS TO CREATE NEW PRODUCTS
    @InheritConfiguration
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
    })
    ProductDto toProductDto(ProductEntity productEntity);

    List<ProductDto> toProductsDto(List<ProductEntity> productsList);

    @InheritInverseConfiguration
    ProductEntity toProductEntity(ProductDto productDto);

    //MAPPERS TO GET THE PRODUCT DETAILS VIEW

    @InheritConfiguration
    @Mappings({
            @Mapping(source = "pProductId", target = "prId"),
            @Mapping(source = "prName", target = "name"),
            @Mapping(source = "prPrice", target = "price"),
            @Mapping(source = "prStock", target = "stock"),
            @Mapping(source = "prSendcost", target = "shipCost"),
            @Mapping(source = "prTumbnail", target = "tumbnail"),
            @Mapping(source = "prPublicdate", target = "publicationDate"),
            @Mapping(source = "prDescript", target = "description"),
            @Mapping(source = "prDetails", target = "details"),
            @Mapping(source = "pSubcategory", target = "subcategory"),
            @Mapping(source = "pImages", target = "images"),
            @Mapping(source = "pComments", target = "comments"),
    })
    DetVProductDto toGetProductDto(ProductEntity productEntity);

    List<DetVProductDto> toGetProductsDto(List<ProductEntity> getProductsList);

    @InheritInverseConfiguration
    ProductEntity toGetProductEntity(DetVProductDto detVProductDto);

    //MAPPERS FOR THE SMART PRODUCT FILTER

    @InheritConfiguration
    @Mapping(source = "prName", target = "name")
    SmartProuctDto toSmartProductDto(ProductEntity productEntity);
    List<SmartProuctDto> toSmartProductsDto(List<ProductEntity> smartProductsList);

    @InheritInverseConfiguration
    ProductEntity toSmartProductEntity(SmartProuctDto smartProuctDto);

}
