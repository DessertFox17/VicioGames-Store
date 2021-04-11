package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.RoleDto;
import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.persistence.entity.RoleEntity;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface RoleMapper {

    RoleDto toRoleDto(RoleEntity roleEntity);
    List<RoleDto> toRolesDto(List<RoleEntity> roles);
    @InheritInverseConfiguration
    RoleEntity toRoleEntity(RoleDto role);

}
