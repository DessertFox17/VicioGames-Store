package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.postput.ImageDto;

public interface ImageDomainRepository {
    ImageDto saveImage(ImageDto imageDto);
}
