package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.CategoryDto;
import com.VicioGames.Store.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/{catName}")
    public Optional<CategoryDto> getCategorybyName(@PathVariable("catName") String name){
        return categoryService.getCategorybyname(name);
    }
}
