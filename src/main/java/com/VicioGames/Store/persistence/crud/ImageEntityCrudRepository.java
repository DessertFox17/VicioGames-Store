package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.ImageEntity;
import org.springframework.data.repository.CrudRepository;

public interface ImageEntityCrudRepository extends CrudRepository<ImageEntity, Integer> {
}
