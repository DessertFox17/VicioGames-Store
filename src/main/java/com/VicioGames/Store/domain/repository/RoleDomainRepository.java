package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.RoleDto;
import java.util.List;
import java.util.Optional;

public interface RoleDomainRepository {
    List<RoleDto> getAll();
    Optional<RoleDto> getByRoleId(int roleId);
}
