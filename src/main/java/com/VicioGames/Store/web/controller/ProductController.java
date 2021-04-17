package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.GetProductDto;
import com.VicioGames.Store.domain.endpointdto.ProductDto;
import com.VicioGames.Store.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/f/{productId}")
    public Optional<GetProductDto> getByUserId(@PathVariable("productId") int prId) {
        return productService.getByProductId(prId);
    }

    @GetMapping("/smartfilter")
    public Optional<List<ProductDto>> smartFilter(@RequestParam("name") String search) {
        System.out.println(search);
        return productService.smartFilter(search);
    }

}
