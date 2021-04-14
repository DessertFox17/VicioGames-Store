package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.UserDto;
import com.VicioGames.Store.domain.repository.UserDomainRepository;
import com.VicioGames.Store.persistence.crud.UserEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.UserEntity;
import com.VicioGames.Store.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public class UserPersistenceRepository implements UserDomainRepository {

    @Autowired
    private UserEntityCrudRepository userEntityCrudRepository;

    @Autowired
    private UserMapper mapper;


    @Override
    public List<UserDto> getAll() {

        return mapper.toUsersDto((List<UserEntity>) userEntityCrudRepository.findAll());

    }

    @Override
    public Optional<UserDto> getByUserId(int uId) {
        return userEntityCrudRepository.findById(uId).map(userEntity -> mapper.toUserDto(userEntity));
    }

    @Override
    public Optional<List<UserDto>> getByRoleId(int rId) {
        List<UserEntity> userEntities  = userEntityCrudRepository.findBypRoleId((rId));
        return Optional.of(mapper.toUsersDto(userEntities));
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
