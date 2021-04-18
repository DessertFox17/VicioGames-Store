package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.CommentDto;
import com.VicioGames.Store.domain.repository.CommentDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService{

    @Autowired
    private CommentDomainRepository commentDomainRepository;

    public CommentDto createComment(CommentDto commentDto) {
        return commentDomainRepository.createComment(commentDto);
    }
}
