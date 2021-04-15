package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.CategoryDto;
import com.VicioGames.Store.domain.repository.CategoryDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryDomainRepository categoryDomainRepository;

    public Optional<CategoryDto> getCategorybyname(String name){
        return categoryDomainRepository.getCategorybyname(name);
    }
}
