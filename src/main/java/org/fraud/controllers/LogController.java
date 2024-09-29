package org.fraud.controllers;

import org.fraud.dtos.PaymentDto;
import org.fraud.services.LogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/log")
public class LogController {

    private final LogService logService;

    public LogController(LogService logService)
    {
        this.logService = logService;
    }

    @GetMapping("/all")
    public ResponseEntity getLogs() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(logService.getAll());
    }

    @PostMapping("/similar")
    public ResponseEntity getSimilarLogs(@RequestBody PaymentDto payment)
    {
        // Logic to check which are similar to the paynent provided
        return ResponseEntity.status(HttpStatus.OK)
                .body(logService.getAll());
    }
}
