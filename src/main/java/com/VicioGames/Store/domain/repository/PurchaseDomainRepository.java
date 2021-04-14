package com.VicioGames.Store.domain.repository;

import com.VicioGames.Store.domain.endpointdto.PurchaseDto;
import java.util.List;
import java.util.Optional;

public interface PurchaseDomainRepository {
    Optional<List<PurchaseDto>> getByClient(int uId);
    PurchaseDto savePurchase(PurchaseDto purchaseDto);
}
