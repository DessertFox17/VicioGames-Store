package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.postput.CommentDto;
import com.VicioGames.Store.persistence.entity.CommentEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    @Mappings({
            @Mapping(source = "pCommentId", target = "cId"),
            @Mapping(source = "pProductId", target = "prId"),
            @Mapping(source = "pUserId", target = "uId"),
            @Mapping(source = "cComment", target = "comment"),
            @Mapping(source = "cQualification", target = "qualification")
    })
    CommentDto toCommentDto(CommentEntity commentEntity);

    List<CommentDto> toComentsDto(List<CommentEntity> commentsList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pProduct", ignore = true),
            @Mapping(target = "pUser", ignore = true),
    })
    CommentEntity toCommentEntity(CommentDto commentDto);


}
