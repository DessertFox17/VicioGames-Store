package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.StatusDto;
import com.VicioGames.Store.persistence.entity.StatusEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StatusMapper {

    @Mappings({
            @Mapping(source = "pStatusId", target = "stId"),
            @Mapping(source = "stName", target = "name"),

    })
    StatusDto toStatusDto(StatusEntity statusEntity);

    List<StatusDto> toStatusDtos(List<StatusEntity> statusList);

    @InheritInverseConfiguration
    @Mapping(target = "pPurchases", ignore = false)
    StatusEntity toStatusEntity(StatusDto statusDto);
}
