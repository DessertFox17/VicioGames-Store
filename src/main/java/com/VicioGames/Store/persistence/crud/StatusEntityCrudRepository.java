package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.StatusEntity;
import org.springframework.data.repository.CrudRepository;

public interface StatusEntityCrudRepository extends CrudRepository<StatusEntity, Integer> {
}
