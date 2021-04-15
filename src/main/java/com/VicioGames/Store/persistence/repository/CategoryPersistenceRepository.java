package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.CategoryDto;
import com.VicioGames.Store.domain.repository.CategoryDomainRepository;
import com.VicioGames.Store.persistence.crud.CategoryEntityCrudRepository;
import com.VicioGames.Store.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CategoryPersistenceRepository implements CategoryDomainRepository {

    @Autowired
    CategoryEntityCrudRepository categoryEntityCrusRepository;

    @Autowired
    CategoryMapper mapper;


    @Override
    public Optional<CategoryDto> getCategorybyname(String name) {

        return categoryEntityCrusRepository.findBycatName(name)
                .map(categoryEntity -> mapper.toCategoryDto(categoryEntity));
    }
}
