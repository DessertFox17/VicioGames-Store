package com.VicioGames.Store.persistence.repository;

import com.VicioGames.Store.domain.endpointdto.postput.PurchaseDto;
import com.VicioGames.Store.domain.repository.PurchaseDomainRepository;
import com.VicioGames.Store.persistence.crud.PurchaseEntityCrudRepository;
import com.VicioGames.Store.persistence.entity.PurchaseEntity;
import com.VicioGames.Store.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PurchasePersistenceRepository implements PurchaseDomainRepository {

    @Autowired
    private PurchaseEntityCrudRepository purchaseEntityCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public Optional<List<PurchaseDto>> getByClient(int uId) {
        return purchaseEntityCrudRepository.findBypUserId(uId)
                .map(purchaseEntities -> mapper.toPurchaseDto(purchaseEntities));
    }

    @Override
    public PurchaseDto savePurchase(PurchaseDto purchaseDto) {
        PurchaseEntity purchaseEntity = mapper.toPurchaseEntity(purchaseDto);
        purchaseEntity.getpProducts().forEach(product -> product.setpPurchase(purchaseEntity));
        return mapper.toPurchaseDto(purchaseEntityCrudRepository.save(purchaseEntity));
    }
}
