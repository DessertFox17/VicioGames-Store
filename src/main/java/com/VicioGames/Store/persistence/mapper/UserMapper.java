package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.domain.endpointdto.userdets.DatUserDto;
import com.VicioGames.Store.persistence.entity.UserEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RoleMapper.class})
public interface UserMapper {

    @InheritConfiguration
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
    })
    UserDto toUserDto(UserEntity userEntity);

    List<UserDto> toUsersDto(List<UserEntity> usersList);

    @InheritInverseConfiguration
    @Mappings({
            //@Mapping(target = "uRegDate", constant = "LocalDateTime.now() f"),
            @Mapping(target = "pRole", ignore = true),
            @Mapping(target = "pPurchases", ignore = true),
            @Mapping(target = "pComments", ignore = true),
    })
    UserEntity toUserEntity(UserDto userDto);


    @InheritConfiguration
    @Mappings({
            @Mapping(source = "pUserId", target = "uId"),
            @Mapping(source = "uFName", target = "firstName"),
            @Mapping(source = "uLName", target = "lastName"),
            @Mapping(source = "uDNINumbr", target = "idNumber"),
            @Mapping(source = "uDNIType", target = "idType"),
            @Mapping(source = "uBitrhDate", target = "bitrhDate"),
            @Mapping(source = "uAddress", target = "address"),
            @Mapping(source = "uPhoneNumbr", target = "phoneNumber"),
            @Mapping(source = "uEmail", target = "email"),
    })
    DatUserDto toDatUserDto(UserEntity userEntity);

    List<DatUserDto> toDatUsersDto(List<UserEntity> usersList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pRoleId", ignore = true),
            @Mapping(target = "uRegDate", ignore = true),
            @Mapping(target = "uPassword", ignore = true),
            @Mapping(target = "uStatus", ignore = true),
            @Mapping(target = "pPurchases", ignore = true),
            @Mapping(target = "pComments", ignore = true),
    })
    UserEntity toUserEntity(DatUserDto DatUserDto);



}
