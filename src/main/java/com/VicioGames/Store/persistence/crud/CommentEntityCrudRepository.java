package com.VicioGames.Store.persistence.crud;

import com.VicioGames.Store.persistence.entity.CommentEntity;
import org.springframework.data.repository.CrudRepository;

public interface CommentEntityCrudRepository extends CrudRepository<CommentEntity, Integer> {
}
