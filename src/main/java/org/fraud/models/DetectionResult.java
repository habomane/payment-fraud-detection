package org.fraud.models;
import org.fraud.types.*;
public class DetectionResult {

    private PaymentDecision paymentDecision;
    private Risk paymentRisk;
    private String error;

    public DetectionResult()
    {
        paymentDecision = PaymentDecision.DECLINE;
        paymentRisk = new Risk();
        error = "";
    }

    public DetectionResult(String error)
    {
        paymentDecision = PaymentDecision.DECLINE;
        paymentRisk = new Risk();
        this.error = error;
    }

    public DetectionResult(PaymentDecision paymentDecision, Risk paymentRisk)
    {
        this.paymentDecision = paymentDecision;
        this.paymentRisk = paymentRisk;
        this.error = "";
    }

    public PaymentDecision getPaymentDecision() { return paymentDecision; }

    public void setPaymentDecision(PaymentDecision paymentDecision) { this.paymentDecision = paymentDecision; }

    public Risk getPaymentRisk() { return paymentRisk; }

    public void setPaymentRisk(Risk paymentRisk) { this.paymentRisk = paymentRisk; }

    public String getError() { return error; }

    public void setError(String error) { this.error = error; }






}
