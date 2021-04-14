package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.PurchaseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseEntityCrudRepository extends CrudRepository<PurchaseEntity, Integer> {
    Optional<List<PurchaseEntity>> findBypUserId(int uId);
}
