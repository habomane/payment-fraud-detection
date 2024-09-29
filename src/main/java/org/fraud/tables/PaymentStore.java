package org.fraud.tables;

import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.*;

@Table
public class PaymentStore {

    public @Id String transactionId = UUID.randomUUID().toString();
    public String merchantName;
    public String merchantOrigin;
    public String merchantLocation;
    public String buyerName;
    public String buyerOrigin;
    public String buyerLocation;
    public String cardExpirationDateHash;
    public String cardHash;
    public String cardCVCHash;
    public Date createdDate = new Date();
    public BigDecimal amount;
    public String currency;

}
