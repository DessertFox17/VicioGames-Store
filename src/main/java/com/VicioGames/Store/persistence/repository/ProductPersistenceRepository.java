package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.ProductDto;
import com.VicioGames.Store.domain.repository.ProductDomainRepository;
import com.VicioGames.Store.persistence.crud.ProductEntityCrudRepository;
import com.VicioGames.Store.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductPersistenceRepository implements ProductDomainRepository {

    @Autowired
    private ProductEntityCrudRepository productEntityCrudRepository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public Optional<ProductDto> getByProductId(int prId) {
        return productEntityCrudRepository.findById(prId).map(productEntity ->  mapper.toProductDto(productEntity));
    }

    @Override
    public Optional<List<ProductDto>> smartFilter(String search) {
        System.out.println(search);
        return productEntityCrudRepository.findByPrNameContaining(search)
                .map(productEntities -> mapper.toProductsDto(productEntities));

    }

}
