package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.ProductDto;
import com.VicioGames.Store.domain.endpointdto.detailprodview.DetVProductDto;
import com.VicioGames.Store.domain.endpointdto.smartfilter.SmartProuctDto;
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
    public Optional<DetVProductDto> getByProductId(int prId) {
        return productEntityCrudRepository.findById(prId).map(productEntity -> mapper.toGetProductDto(productEntity));
    }

    @Override
    public Optional<List<SmartProuctDto>> smartFilter(String search) {
        return productEntityCrudRepository.findByPrNameContaining(search)
                .map(productEntities -> mapper.toSmartProductsDto(productEntities));

    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        ProductEntity productEntity = mapper.toProductEntity(productDto);
        return mapper.toProductDto(productEntityCrudRepository.save(productEntity));
    }

}
