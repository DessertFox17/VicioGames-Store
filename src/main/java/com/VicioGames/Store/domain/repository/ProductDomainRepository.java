package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.ProductDto;
import com.VicioGames.Store.domain.endpointdto.detailprodview.DetVProductDto;
import com.VicioGames.Store.domain.endpointdto.smartfilter.SmartProuctDto;

import java.util.List;
import java.util.Optional;

public interface ProductDomainRepository {
    Optional<DetVProductDto> getByProductId(int prId);
    Optional<List<SmartProuctDto>> smartFilter(String search);
    ProductDto createProduct(ProductDto productDto);
}
