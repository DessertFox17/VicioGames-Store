package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.ImageDto;
import com.VicioGames.Store.domain.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/save")
    public ImageDto saveImage(@RequestBody ImageDto imageDto) {
        return imageService.saveImage(imageDto);
    }
}
