package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.StatusDto;
import com.VicioGames.Store.domain.repository.StatusDomainRepository;
import com.VicioGames.Store.persistence.crud.StatusEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.StatusEntity;
import com.VicioGames.Store.persistence.mapper.StatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StatusPersistenceRepository implements StatusDomainRepository {

    @Autowired
    private StatusEntityCrudRepository statusEntityCrudRepository;

    @Autowired
    private StatusMapper mapper;


    @Override
    public List<StatusDto> getAll() {
        return mapper.toStatusDtos((List< StatusEntity >) statusEntityCrudRepository.findAll());
    }
}
