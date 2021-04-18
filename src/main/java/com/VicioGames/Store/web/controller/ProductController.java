package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.ProductDto;
import com.VicioGames.Store.domain.endpointdto.detailprodview.DetVProductDto;
import com.VicioGames.Store.domain.endpointdto.smartfilter.SmartProuctDto;
import com.VicioGames.Store.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/new")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

    @GetMapping("/{productId}")
    public Optional<DetVProductDto> getByUserId(@PathVariable("productId") int prId) {
        return productService.getByProductId(prId);
    }

    @GetMapping("/smartfilter")
    public Optional<List<SmartProuctDto>> smartFilter(@RequestParam("name") String search) {
        return productService.smartFilter(search);
    }



}
