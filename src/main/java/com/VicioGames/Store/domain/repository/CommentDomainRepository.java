package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.postput.CommentDto;

public interface CommentDomainRepository {
    CommentDto createComment(CommentDto commentDto);
}
