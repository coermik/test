package com.zero.convpay.dto;

import com.zero.convpay.type.PayResult;

public class PayReseponse {
    // 결제 결과
    PayResult payResult;
    // 결제 성공 금액
    Integer paidAmount;

    @Override
    public String toString() {
        return "PayReseponse{" +
                "payResult=" + payResult +
                ", paidAmount=" + paidAmount +
                '}';
    }

    public PayReseponse(PayResult payResult, Integer paidAmount) {
        this.payResult = payResult;
        this.paidAmount = paidAmount;
    }

    public PayResult getPayResult() {
        return payResult;
    }

    public void setPayResult(PayResult payResult) {
        this.payResult = payResult;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }
}
