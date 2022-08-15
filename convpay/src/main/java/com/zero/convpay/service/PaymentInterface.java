package com.zero.convpay.service;

import com.zero.convpay.type.CancelPaymentResult;
import com.zero.convpay.type.PaymentResult;

public interface PaymentInterface {
    PaymentResult payment(Integer payAmount);
    CancelPaymentResult cancelPayment(Integer cancelAmount);
}
