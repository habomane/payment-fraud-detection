package org.fraud.controllers;

import org.fraud.models.Risk;
import org.fraud.services.RiskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risk")
public class RiskController {

    private final RiskService riskService;

    public RiskController(RiskService riskService) { this.riskService = riskService; }

    @PostMapping
    public Risk getRisk()
    {
        return riskService.getRisk();
    }

}
