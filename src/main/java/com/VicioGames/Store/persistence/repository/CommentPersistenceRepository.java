package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.CommentDto;
import com.VicioGames.Store.domain.repository.CommentDomainRepository;
import com.VicioGames.Store.persistence.crud.CommentEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.CommentEntity;
import com.VicioGames.Store.persistence.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentPersistenceRepository implements CommentDomainRepository {

    @Autowired
    private CommentEntityCrudRepository commentEntityCrudRepository;

    @Autowired
    private CommentMapper mapper;


    @Override
    public CommentDto createComment(CommentDto commentDto) {
        CommentEntity commentEntity = mapper.toCommentEntity(commentDto);
        return mapper.toCommentDto(commentEntityCrudRepository.save(commentEntity));
    }
}
