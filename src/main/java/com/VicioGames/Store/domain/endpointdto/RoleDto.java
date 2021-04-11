package com.VicioGames.Store.domain.endpointdto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class RoleDto {

    private int roleId;
    private String rName;
    private List<UserDto> users;
}
