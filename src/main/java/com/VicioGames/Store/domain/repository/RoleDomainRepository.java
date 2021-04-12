package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.RoleDto;

import javax.management.relation.Role;
import java.util.List;
import java.util.Optional;

public interface RoleDomainRepository {
    List<RoleDto> getAll();
    //Optional<List<RoleDto>> getByRoleType(int id);
}
