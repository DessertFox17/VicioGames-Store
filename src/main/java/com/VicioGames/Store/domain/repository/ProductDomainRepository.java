package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.GetProductDto;
import com.VicioGames.Store.domain.endpointdto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductDomainRepository {
    Optional<GetProductDto> getByProductId(int prId);
    Optional<List<ProductDto>> smartFilter(String search);
}
