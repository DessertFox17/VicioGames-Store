package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.RoleDto;
import com.VicioGames.Store.persistence.entity.RoleEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface RoleMapper {

    @Mappings({
            @Mapping(source = "pRoleId", target = "rId"),
            @Mapping(source = "rName", target = "role"),
            @Mapping(source = "pUsers", target = "users")
    })
    RoleDto toRoleDto(RoleEntity roleEntity);

    List<RoleDto> toRolesDto(List<RoleEntity> rolesList);

    @InheritInverseConfiguration
    RoleEntity toRoleEntity(RoleDto roleDto);

}
