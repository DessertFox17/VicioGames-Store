package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.postput.ProductPurchaseDto;
import com.VicioGames.Store.persistence.entity.ProductPurchaseEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface ProductPurchaseMapper {

    @Mappings({
            @Mapping(source = "pId.pProductId", target = "prId"),
            @Mapping(source = "ppQuantity", target = "quantity"),
            @Mapping(source = "ppTotProdsCost", target = "totProductsCost"),
            @Mapping(source = "ppTotSendCost", target = "totShipCost"),
            @Mapping(source = "ppPurchaseCost", target = "purchaseCost")
    })
    ProductPurchaseDto toProductPurchaseDto(ProductPurchaseEntity productPurchaseEntity);

    List<ProductPurchaseDto> toProductpurchasesDto(List<ProductPurchaseEntity> productPurchasesList);
@InheritInverseConfiguration
@Mappings({
        @Mapping(target = "pProduct", ignore = true),
        @Mapping(target = "pPurchase", ignore = true),
        @Mapping(target = "pId.pPurchaseId", ignore = true)
})
    ProductPurchaseEntity toProductPurchaseEntity(ProductPurchaseDto productPurchaseDto);
}
