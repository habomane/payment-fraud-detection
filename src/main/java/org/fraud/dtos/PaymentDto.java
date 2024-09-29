package org.fraud.dtos;

import org.fraud.models.Payment;
import org.fraud.tables.PaymentStore;

import java.math.BigDecimal;
import java.util.*;

public class PaymentDto {

    private String merchantName;
    private String merchantOrigin;
    private String merchantLocation;
    private String buyerName;
    private String buyerOrigin;
    private String buyerLocation;
    private String cardExpirationDateHash;
    private String cardHash;
    private String cardCVCHash;
    private BigDecimal amount;
    private String currency;

    public PaymentDto() {}

    public PaymentDto(String merchantName, String merchantOrigin, String merchantLocation,
                   String buyerName, String buyerOrigin, String buyerLocation,
                   String cardExpirationDate, String card, String cardCVC,
                   BigDecimal amount, String currency)
    {
        this.merchantName = merchantName;
        this.merchantOrigin = merchantOrigin;
        this.merchantLocation = merchantLocation;
        this.buyerName = buyerName;
        this.buyerOrigin = buyerOrigin;
        this.buyerLocation = buyerLocation;
        this.cardExpirationDateHash = cardExpirationDate;
        this.cardHash = card;
        this.cardCVCHash = cardCVC;
        this.amount = amount;
        this.currency = currency;
    }

    public PaymentStore toPaymentStore()
    {
        PaymentStore payment =  new PaymentStore();
        payment.amount = amount;
        payment.buyerLocation = buyerLocation;
        payment.buyerName = buyerName;
        payment.buyerOrigin = buyerOrigin;
        payment.merchantName = merchantName;
        payment.merchantLocation = merchantLocation;
        payment.merchantOrigin = merchantOrigin;
        payment.currency = currency;
        payment.cardExpirationDateHash = cardExpirationDateHash;
        payment.cardCVCHash = cardCVCHash;
        payment.cardHash = cardHash;

        return payment;
   }

   @Override
    public String toString() {
        return String.format("Merchant Name: %s \nMerchant Origin: %s \nMerchant Location: %s \nBuyer Name: %s",
                merchantName, merchantOrigin, merchantLocation, buyerName);
   }

    // Getters and Setters

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantOrigin() {
        return merchantOrigin;
    }

    public void setMerchantOrigin(String merchantOrigin) {
        this.merchantOrigin = merchantOrigin;
    }

    public String getMerchantLocation() {
        return merchantLocation;
    }

    public void setMerchantLocation(String merchantLocation) {
        this.merchantLocation = merchantLocation;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerOrigin() {
        return buyerOrigin;
    }

    public void setBuyerOrigin(String buyerOrigin) {
        this.buyerOrigin = buyerOrigin;
    }

    public String getBuyerLocation() {
        return buyerLocation;
    }

    public void setBuyerLocation(String buyerLocation) {
        this.buyerLocation = buyerLocation;
    }

    public String getCardExpirationDateHash() {
        return cardExpirationDateHash;
    }

    public void setCardExpirationDateHash(String cardExpirationDateHash) {
        this.cardExpirationDateHash = cardExpirationDateHash;
    }

    public String getCardHash() {
        return cardHash;
    }

    public void setCardHash(String cardHash) {
        this.cardHash = cardHash;
    }

    public String getCardCVCHash() {
        return cardCVCHash;
    }

    public void setCardCVCHash(String cardCVCHash) {
        this.cardCVCHash = cardCVCHash;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


}
