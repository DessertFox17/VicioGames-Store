package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.RoleDto;
import com.VicioGames.Store.persistence.entity.RoleEntity;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface RoleMapper {

    @Mappings({
            @Mapping(source = "roleId", target = "id"),
            @Mapping(source = "rName", target = "role")
            //@Mapping(source = "userEntities", target = "users")
    })
    RoleDto toRoleDto(RoleEntity roleEntity);

    List<RoleDto> toRolesDto(List<RoleEntity> roleEntities);

    @InheritInverseConfiguration
    RoleEntity toRoleEntity(RoleDto roleDto);

}
