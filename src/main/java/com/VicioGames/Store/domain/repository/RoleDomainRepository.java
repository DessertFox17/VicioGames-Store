package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.persistence.entity.RoleEntity;
import java.util.Optional;

public interface RoleDomainRepository {
    Optional<RoleEntity> getByRoleId(int roleId);
}
