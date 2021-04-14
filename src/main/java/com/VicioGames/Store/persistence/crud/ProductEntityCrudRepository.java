package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductEntityCrudRepository extends CrudRepository<ProductEntity, Integer> {
     Optional<List<ProductEntity>> findByPrNameContaining(String subString);
}
