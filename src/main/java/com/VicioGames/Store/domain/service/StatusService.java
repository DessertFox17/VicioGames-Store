package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.StatusDto;
import com.VicioGames.Store.domain.repository.StatusDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    @Autowired
    private StatusDomainRepository statusDomainRepository;

    public List<StatusDto> getAll(){
        return statusDomainRepository.getAll();
    }
}
