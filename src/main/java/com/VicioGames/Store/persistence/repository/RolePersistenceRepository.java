package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.postput.RoleDto;
import com.VicioGames.Store.domain.repository.RoleDomainRepository;
import com.VicioGames.Store.persistence.crud.RoleEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.RoleEntity;
import com.VicioGames.Store.persistence.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class RolePersistenceRepository implements RoleDomainRepository {

    @Autowired
    private RoleEntityCrudRepository roleEntityCrudRepository;

    @Autowired
    private RoleMapper mapper;

    @Override
    public Optional<List<RoleDto>> getByRole(String role) {
        List<RoleEntity> roleEntities = roleEntityCrudRepository.findByrName(role);
        return Optional.of(mapper.toRolesDto(roleEntities));
    }
}
