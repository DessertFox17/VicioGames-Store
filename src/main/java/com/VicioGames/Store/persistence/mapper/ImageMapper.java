package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.CommentDto;
import com.VicioGames.Store.domain.endpointdto.ImageDto;
import com.VicioGames.Store.persistence.entity.CommentEntity;
import com.VicioGames.Store.persistence.entity.ImageEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImageMapper {

    @InheritConfiguration
    @Mappings({
            @Mapping(source = "pImageId", target = "iId"),
            @Mapping(source = "iURL", target = "URL")
    })
    ImageDto toImageDto(ImageEntity imageEntity);

    List<CommentDto> toCommentsDto(List<CommentEntity> commentsList);

    @InheritInverseConfiguration
    @Mapping(target = "pProduct", ignore = true)
    ImageEntity toImageEntity(ImageDto imageDto);
}
