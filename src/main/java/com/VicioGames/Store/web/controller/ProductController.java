package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.get.GetProductDto;
import com.VicioGames.Store.domain.endpointdto.postput.ProductDto;
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
    public Optional<GetProductDto> getByUserId(@PathVariable("productId") int prId) {
        return productService.getByProductId(prId);
    }

    @GetMapping("/smartfilter")
    public Optional<List<GetProductDto>> smartFilter(@RequestParam("name") String search) {
        System.out.println(search);
        return productService.smartFilter(search);
    }



}
