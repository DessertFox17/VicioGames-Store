package com.VicioGames.Store.web.controller;

import com.VicioGames.Store.domain.endpointdto.PurchaseDto;
import com.VicioGames.Store.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/f/{userId}")
    public Optional<List<PurchaseDto>> getByClient(@PathVariable("userId")int uId){
        return purchaseService.getByClient(uId);
    }

    @PostMapping("/s")
    public PurchaseDto savePurchase(@RequestBody PurchaseDto purchaseDto){
        return purchaseService.savePurchase(purchaseDto);
    }
}
