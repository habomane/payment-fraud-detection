package org.fraud.services;

import org.fraud.tables.PaymentStore;
import java.util.*;

public interface ILogService {

    List<PaymentStore> getAll();
}
