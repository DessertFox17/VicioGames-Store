package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.CommentDto;

public interface CommentDomainRepository {
    CommentDto createComment(CommentDto commentDto);
}
