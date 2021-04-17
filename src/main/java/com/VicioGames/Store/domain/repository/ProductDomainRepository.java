package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.get.GetProductDto;
import com.VicioGames.Store.domain.endpointdto.postput.ProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductDomainRepository {
    Optional<GetProductDto> getByProductId(int prId);
    Optional<List<GetProductDto>> smartFilter(String search);
    ProductDto createProduct(ProductDto productDto);
}
