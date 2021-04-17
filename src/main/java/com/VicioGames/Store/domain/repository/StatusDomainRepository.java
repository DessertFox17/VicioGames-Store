package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.postput.StatusDto;

import java.util.List;

public interface StatusDomainRepository {
    List<StatusDto> getAll();
}
