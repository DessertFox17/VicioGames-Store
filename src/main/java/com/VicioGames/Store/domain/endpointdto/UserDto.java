package com.VicioGames.Store.domain.endpointdto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class UserDto {

    private int userId;
    private int roleId;
    private String uFName;
    private String uLName;
    private int uDNINumbr;
    private String uDNIType;
    private LocalDateTime uBitrhDate;
    private LocalDateTime uRegDate;
    private String uAddress;
    private long uPhoneNumbr;
    private String uEmail;
    private String uPassword;
    private boolean uStatus;
    private RoleDto role;
}
