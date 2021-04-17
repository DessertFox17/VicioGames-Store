package com.VicioGames.Store.domain.service;

import com.VicioGames.Store.domain.endpointdto.postput.PurchaseDto;
import com.VicioGames.Store.domain.repository.PurchaseDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseDomainRepository purchaseDomainRepository;

    public Optional<List<PurchaseDto>> getByClient(int uId){
        return purchaseDomainRepository.getByClient(uId);
    }
    public PurchaseDto savePurchase(PurchaseDto purchaseDto){
        return purchaseDomainRepository.savePurchase(purchaseDto);
    }
}
