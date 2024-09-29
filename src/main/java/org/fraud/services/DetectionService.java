package org.fraud.services;

import org.fraud.dtos.PaymentDto;
import org.fraud.models.DetectionResult;
import org.fraud.models.Payment;
import org.fraud.repositories.PaymentStoreRepo;
import org.fraud.tables.PaymentStore;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DetectionService implements IDetectionService {

    private final PaymentStoreRepo paymentStoreRepo;

    public DetectionService(PaymentStoreRepo testRepo) { this.paymentStoreRepo = testRepo; }

    @Override
    public void save(PaymentDto payment) {
        PaymentStore store = payment.toPaymentStore();
        paymentStoreRepo.post(store.transactionId, store.merchantName, store.merchantOrigin,
                store.merchantLocation, store.buyerName, store.buyerOrigin, store.buyerLocation,
                store.cardExpirationDateHash, store.cardHash, store.cardCVCHash, store.amount,
                store.createdDate, store.currency);
    }

    @Override
    public List<PaymentStore> getAll() {
        List<PaymentStore> response = new ArrayList<>();
        paymentStoreRepo.findAll().forEach(response::add);
        return response;
    }


}
