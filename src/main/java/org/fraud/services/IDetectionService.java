package org.fraud.services;

import org.fraud.dtos.PaymentDto;
import org.fraud.models.DetectionResult;
import org.fraud.tables.PaymentStore;
import java.util.*;

public interface IDetectionService {

    void save(PaymentDto payment);

    List<PaymentStore> getAll();
}
