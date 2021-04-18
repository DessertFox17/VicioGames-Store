package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.domain.endpointdto.userdets.DatUserDto;
import com.VicioGames.Store.domain.repository.UserDomainRepository;
import com.VicioGames.Store.persistence.crud.UserEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.UserEntity;
import com.VicioGames.Store.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserPersistenceRepository implements UserDomainRepository {

    @Autowired
    private UserEntityCrudRepository userEntityCrudRepository;

    @Autowired
    private UserMapper mapper;


    @Override
    public Optional<DatUserDto> getByUserId(int uId) {
        return userEntityCrudRepository.findById(uId).map(userEntity -> mapper.toDatUserDto(userEntity));
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = mapper.toUserEntity(userDto);
        return mapper.toUserDto(userEntityCrudRepository.save(userEntity));
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        UserEntity userEntity = mapper.toUserEntity(userDto);
        return mapper.toUserDto(userEntityCrudRepository.save(userEntity));
    }

    @Override
    public void deleteUser(int uId) {
        userEntityCrudRepository.deleteById(uId);
    }

}
