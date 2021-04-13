package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RoleMapper.class})
public interface UserMapper {

    @Mappings({
            @Mapping(source = "pUserId", target = "uId"),
            @Mapping(source = "pRoleId", target = "rId"),
            @Mapping(source = "uFName", target = "firstName"),
            @Mapping(source = "uLName", target = "lastName"),
            @Mapping(source = "uDNINumbr", target = "idNumber"),
            @Mapping(source = "uDNIType", target = "idType"),
            @Mapping(source = "uBitrhDate", target = "bitrhDate"),
            @Mapping(source = "uRegDate", target = "createdDate"),
            @Mapping(source = "uAddress", target = "address"),
            @Mapping(source = "uPhoneNumbr", target = "phoneNumber"),
            @Mapping(source = "uEmail", target = "email"),
            @Mapping(source = "uPassword", target = "password"),
            @Mapping(source = "uStatus", target = "status"),
            @Mapping(source = "pRole", target = "role"),
            @Mapping(source = "pPurchases", target = "purchases"),
            @Mapping(source = "pComments", target = "comments")
    }) UserDto toUserDto(UserEntity userEntity);

    List<UserDto> toUsersDto(List<UserEntity> usersList);

    @InheritInverseConfiguration
    UserEntity toUserEntity(UserDto userDto);

}
