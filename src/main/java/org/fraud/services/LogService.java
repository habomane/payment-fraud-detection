package org.fraud.services;

import org.fraud.dtos.PaymentDto;
import org.fraud.repositories.PaymentStoreRepo;
import org.fraud.tables.PaymentStore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogService implements ILogService {

    private final PaymentStoreRepo paymentStoreRepo;

    public LogService(PaymentStoreRepo testRepo) { this.paymentStoreRepo = testRepo; }

    @Override
    public List<PaymentStore> getAll() {
        List<PaymentStore> response = new ArrayList<>();
        paymentStoreRepo.findAll().forEach(response::add);
        return response;
    }
}
