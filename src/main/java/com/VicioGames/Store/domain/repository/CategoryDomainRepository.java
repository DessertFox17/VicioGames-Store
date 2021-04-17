package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.postput.CategoryDto;

import java.util.Optional;

public interface CategoryDomainRepository {
    Optional<CategoryDto> getCategorybyname(String name);
}
