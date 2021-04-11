package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = RoleMapper.class)
public interface UserMapper {

    UserDto toUserDto(UserEntity userEntity);
    List<UserDto> toUsersDto(List<UserEntity> users);
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "purchases",ignore = true),
            @Mapping(target = "comments",ignore = true),
    })
    UserEntity toUserEntity(UserDto userDto);

}
