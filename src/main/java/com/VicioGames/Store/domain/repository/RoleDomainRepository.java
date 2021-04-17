package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.postput.RoleDto;

import java.util.List;
import java.util.Optional;

public interface RoleDomainRepository {
    Optional<List<RoleDto>> getByRole(String role);
}
