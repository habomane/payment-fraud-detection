package org.fraud.controllers;

import oracle.ucp.proxy.annotation.Post;
import org.fraud.dtos.PaymentDto;
import org.fraud.models.Payment;
import org.fraud.services.DetectionService;
import org.fraud.tables.PaymentStore;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/detection")
public class DetectionController {

    private final DetectionService detectionService;

    public DetectionController(DetectionService detectionService)
    {
        this.detectionService = detectionService;
    }

    @PostMapping
    public ResponseEntity getDetectionResult(@RequestBody PaymentDto payment) {

        // Check logic
    System.out.println(payment.toString());
        // Store payment for later analysis
        detectionService.save(payment);

        // Return detection result
        return ResponseEntity.status(HttpStatus.OK)
                .body(detectionService.getAll());
    }



}
