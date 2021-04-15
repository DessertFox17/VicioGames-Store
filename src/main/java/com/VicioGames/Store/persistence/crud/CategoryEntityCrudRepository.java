package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryEntityCrudRepository extends CrudRepository<CategoryEntity, Integer> {
    Optional<CategoryEntity> findBycatName(String catName);
}
