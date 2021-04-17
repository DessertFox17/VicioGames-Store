package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.postput.ImageDto;
import com.VicioGames.Store.domain.repository.ImageDomainRepository;
import com.VicioGames.Store.persistence.crud.ImageEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.ImageEntity;
import com.VicioGames.Store.persistence.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImagePersistenceRepository implements ImageDomainRepository {

    @Autowired
    private ImageEntityCrudRepository imageEntityCrudRepository;
    @Autowired
    private ImageMapper mapper;

    @Override
    public ImageDto saveImage(ImageDto imageDto) {
        ImageEntity imageEntity = mapper.toImageEntity(imageDto);
        return mapper.toImageDto(imageEntityCrudRepository.save(imageEntity));
    }
}
