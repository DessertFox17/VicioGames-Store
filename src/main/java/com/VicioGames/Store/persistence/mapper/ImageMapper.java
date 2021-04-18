package com.VicioGames.Store.persistence.mapper;

import com.VicioGames.Store.domain.endpointdto.detailprodview.DetVtImageDto;
import com.VicioGames.Store.domain.endpointdto.ImageDto;
import com.VicioGames.Store.persistence.entity.ImageEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImageMapper {

    @InheritConfiguration
    @Mappings({
            @Mapping(source = "pImageId", target = "iId"),
            @Mapping(source = "pProductId", target = "prId"),
            @Mapping(source = "iURL", target = "URL")
    })
    ImageDto toImageDto(ImageEntity imageEntity);

    List<ImageDto> toImagessDto(List<ImageEntity> imagesList);

    @InheritInverseConfiguration
    @Mapping(target = "pProduct", ignore = true)
    ImageEntity toImageEntity(ImageDto imageDto);

    @InheritConfiguration

    @Mapping(source = "iURL", target = "URL")
    DetVtImageDto toGetImageDto(ImageEntity imageEntity);

    List<DetVtImageDto> toGetImagesDto(List<ImageEntity> getImagesList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pProduct", ignore = true),
            @Mapping(target = "pImageId", ignore = true),
            @Mapping(target = "pProductId", ignore = true),
    })
    ImageEntity toImageEntity(DetVtImageDto detVtImageDto);


}
