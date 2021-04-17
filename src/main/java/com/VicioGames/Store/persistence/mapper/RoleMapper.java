package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.postput.RoleDto;
import com.VicioGames.Store.persistence.entity.RoleEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper{

    @Mappings({
            @Mapping(source = "pRoleId", target = "rId"),
            @Mapping(source = "rName", target = "role"),
    })
    RoleDto toRoleDto(RoleEntity roleEntity);

    List<RoleDto> toRolesDto(List<RoleEntity> rolesList);

    @InheritInverseConfiguration
    @Mapping(target = "pUsers", ignore = true)
    RoleEntity toRoleEntity(RoleDto roleDto);

}
