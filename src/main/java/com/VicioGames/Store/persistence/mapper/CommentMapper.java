package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.CommentDto;
import com.VicioGames.Store.domain.endpointdto.detailprodview.DetVCommentDto;
import com.VicioGames.Store.persistence.entity.CommentEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    @InheritConfiguration
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

    @InheritConfiguration
    @Mappings({
            @Mapping(source = "cComment", target = "comment"),
            @Mapping(source = "cQualification", target = "qualification")
    })
    DetVCommentDto toDetVCommentDto(CommentEntity commentEntity);

    List<DetVCommentDto> toGetComentsDto(List<CommentEntity> commentsList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pCommentId", ignore = true),
            @Mapping(target = "pProductId", ignore = true),
            @Mapping(target = "pUserId", ignore = true),
            @Mapping(target = "pProduct", ignore = true),
            @Mapping(target = "pUser", ignore = true),
    })
    CommentEntity toCommentEntity(DetVCommentDto getCommentDto);

}
