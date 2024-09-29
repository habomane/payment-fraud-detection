package org.fraud.models;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Payment {

    private UUID transactionId;
    private String merchantName;
    private String merchantOrigin;
    private String merchantLocation;
    private String buyerName;
    private String buyerOrigin;
    private String buyerLocation;
    private String cardExpirationDateHash;
    private String cardHash;
    private String cardCVCHash;
    private Date createdDate;
    private BigDecimal amount;
    private String currency;

    public Payment() {}

    public Payment(UUID transactionId, String merchantName, String merchantOrigin, String merchantLocation,
                   String buyerName, String buyerOrigin, String buyerLocation,
                   String cardExpirationDateHash, String cardHash, String cardCVCHash,
                   Date createdDate, BigDecimal amount, String currency)
    {
        this.transactionId = transactionId;
        this.transactionId = UUID.randomUUID();
        this.merchantName = merchantName;
        this.merchantOrigin = merchantOrigin;
        this.merchantLocation = merchantLocation;
        this.buyerName = buyerName;
        this.buyerOrigin = buyerOrigin;
        this.buyerLocation = buyerLocation;
        this.cardExpirationDateHash = cardExpirationDateHash;
        this.cardHash = cardHash;
        this.cardCVCHash = cardCVCHash;
        this.createdDate = createdDate;
        this.amount = amount;
        this.currency = currency;
    }

}
