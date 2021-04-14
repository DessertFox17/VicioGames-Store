package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.PurchaseDto;
import com.VicioGames.Store.persistence.entity.PurchaseEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductPurchaseMapper.class})
public interface PurchaseMapper {
    @Mappings({
            @Mapping(source = "pPurchaseId", target = "puId"),
            @Mapping(source = "pStatusId", target = "stId"),
            @Mapping(source = "pUserId", target = "uId"),
            @Mapping(source = "pDate", target = "date"),
            @Mapping(source = "pPayMeth", target = "payMeth"),
            @Mapping(source = "pComment", target = "comment"),
            @Mapping(source = "pProducts", target = "products"),
    })
    PurchaseDto toPurchaseDto(PurchaseEntity purchaseEntity);

    List<PurchaseDto> toPurchaseDto(List<PurchaseEntity> purchasesList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pStatus", ignore = true),
            @Mapping(target = "pUser", ignore = true)
    })

    PurchaseEntity toPurchaseEntity(PurchaseDto purchaseDto);
}
