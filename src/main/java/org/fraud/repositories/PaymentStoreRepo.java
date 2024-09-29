package org.fraud.repositories;

import org.fraud.tables.PaymentStore;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

@Repository
public interface PaymentStoreRepo extends CrudRepository<PaymentStore, String> {

    @Modifying
    @Transactional
    @Query("INSERT INTO PAYMENT_STORE(TRANSACTION_ID, MERCHANT_NAME, MERCHANT_ORIGIN, MERCHANT_LOCATION, BUYER_NAME, BUYER_ORIGIN, BUYER_LOCATION, CARD_EXPIRATION_DATE_HASH, CARD_HASH, CARD_CVC_HASH, AMOUNT, CREATED_DATE, CURRENCY)" +
            " VALUES(:transactionId, :merchantName, :merchantOrigin, :merchantLocation, :buyerName, :buyerOrigin, :buyerLocation, :cardExpirationDateHash, :cardHash, :cardCVCHash, :amount, :createdDate, :currency)")
    void post(@Param("transactionId") String transactionId,
              @Param("merchantName") String merchantName,
              @Param("merchantOrigin") String merchantOrigin,
              @Param("merchantLocation") String merchantLocation,
              @Param("buyerName") String buyerName,
              @Param("buyerOrigin") String buyerOrigin,
              @Param("buyerLocation") String buyerLocation,
              @Param("cardExpirationDateHash") String cardExpirationDateHash,
              @Param("cardHash") String cardHash,
              @Param("cardCVCHash") String cardCVCHash,
              @Param("amount") BigDecimal amount,
              @Param("createdDate") Date createdDate,
              @Param("currency") String currency);

}
