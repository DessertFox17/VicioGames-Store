package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.get.GetProductDto;
import com.VicioGames.Store.domain.endpointdto.postput.ProductDto;
import com.VicioGames.Store.domain.repository.ProductDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductDomainRepository productDomainRepository;

    public Optional<GetProductDto> getByProductId(int prId) {
        return productDomainRepository.getByProductId(prId);
    }

    public Optional<List<GetProductDto>> smartFilter(String search) {
        System.out.println(search);
        return productDomainRepository.smartFilter(search);
    }

    public ProductDto createProduct(ProductDto productDto){
        return productDomainRepository.createProduct(productDto);
    }
}
