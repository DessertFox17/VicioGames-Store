package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.get.GetProductDto;
import com.VicioGames.Store.domain.endpointdto.postput.ProductDto;
import com.VicioGames.Store.domain.repository.ProductDomainRepository;
import com.VicioGames.Store.persistence.crud.ProductEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.ProductEntity;
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
    public Optional<GetProductDto> getByProductId(int prId) {
        return productEntityCrudRepository.findById(prId).map(productEntity -> mapper.toGetProductDto(productEntity));
    }

    @Override
    public Optional<List<GetProductDto>> smartFilter(String search) {
        return productEntityCrudRepository.findByPrNameContaining(search)
                .map(productEntities -> mapper.toGetProductsDto(productEntities));

    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        ProductEntity productEntity = mapper.toProductEntity(productDto);
        return mapper.toProductDto(productEntityCrudRepository.save(productEntity));
    }

}
