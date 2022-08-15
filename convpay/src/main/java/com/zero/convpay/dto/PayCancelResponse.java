package com.zero.convpay.dto;

import com.zero.convpay.type.ConvenienceType;
import com.zero.convpay.type.PayCancelResult;

public class PayCancelResponse {
    public PayCancelResult getPayCancelResult() {
        return payCancelResult;
    }

    public PayCancelResponse(PayCancelResult payCancelResult, Integer payCanceledAmount) {
        this.payCancelResult = payCancelResult;
        this.payCanceledAmount = payCanceledAmount;
    }

    public void setPayCancelResult(PayCancelResult payCancelResult) {
        this.payCancelResult = payCancelResult;
    }

    public Integer getPayCanceledAmount() {
        return payCanceledAmount;
    }

    public void setPayCanceledAmount(Integer payCanceledAmount) {
        this.payCanceledAmount = payCanceledAmount;
    }

    PayCancelResult payCancelResult;
    Integer payCanceledAmount;

    @Override
    public String toString() {
        return "PayCancelResponse{" +
                "payCancelResult=" + payCancelResult +
                ", payCanceledAmount=" + payCanceledAmount +
                '}';
    }
}
