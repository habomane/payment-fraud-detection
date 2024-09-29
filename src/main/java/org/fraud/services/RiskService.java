package org.fraud.services;

import org.fraud.models.Risk;
import org.springframework.stereotype.Service;

@Service
public class RiskService implements IRiskService {

    @Override
    public Risk getRisk() {
        return new Risk(5, "Test");
    }
}
