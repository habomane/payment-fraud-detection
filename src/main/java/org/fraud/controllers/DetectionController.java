package org.fraud.controllers;

import org.fraud.dtos.PaymentDto;
import org.fraud.services.DetectionService;
import org.fraud.util.Security;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/detection")
public class DetectionController {

    private final DetectionService detectionService;
    private final Security s = new Security();

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
