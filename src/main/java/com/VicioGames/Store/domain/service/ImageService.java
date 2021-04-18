package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.ImageDto;
import com.VicioGames.Store.domain.repository.ImageDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private ImageDomainRepository imageDomainRepository;

    public ImageDto saveImage(ImageDto imageDto) {
        return imageDomainRepository.saveImage(imageDto);
    }

}
