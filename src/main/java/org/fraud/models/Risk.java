package org.fraud.models;

public class Risk {

    private Integer riskScore;
    private String reason;

    public Risk()
    {
        this.riskScore = 0;
        this.reason = "";
    }

    public Risk(Integer riskScore, String reason)
    {
        this.riskScore = riskScore;
        this.reason = reason;
    }

    public Integer getRiskScore() { return riskScore; }

    public void setRiskScore(Integer riskScore) { this.riskScore = riskScore; }

    public String getReason() { return reason; }

    public void setReason(String reason) { this.reason = reason; }



}
