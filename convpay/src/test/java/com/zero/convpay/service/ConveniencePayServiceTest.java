package com.zero.convpay.service;

import com.zero.convpay.dto.PayCancelRequest;
import com.zero.convpay.dto.PayCancelResponse;
import com.zero.convpay.type.ConvenienceType;
import com.zero.convpay.dto.PayRequest;
import com.zero.convpay.dto.PayReseponse;
import com.zero.convpay.type.PayCancelResult;
import com.zero.convpay.type.PayMethodType;
import com.zero.convpay.type.PayResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConveniencePayServiceTest {
    ConveniencePayService conveniencePayService = new ConveniencePayService();

    @Test
    void pay_success() {
        //given
        PayRequest payRequest = new PayRequest(PayMethodType.MONEY, ConvenienceType.G25, 50);

        //when
        PayReseponse payReseponse = conveniencePayService.pay(payRequest);

        //then
        assertEquals(PayResult.SUCCESS, payReseponse.getPayResult());
        assertEquals(50, payReseponse.getPaidAmount());
    }
    @Test
    void pay_fail() {
        //given
        PayRequest payRequest = new PayRequest(PayMethodType.MONEY, ConvenienceType.G25, 1000_001);

        //when
        PayReseponse payReseponse = conveniencePayService.pay(payRequest);

        //then
        assertEquals(PayResult.FAIL, payReseponse.getPayResult());
        assertEquals(0, payReseponse.getPaidAmount());
    }

    @Test
    void pay_cancel_success() {
        //given
        PayCancelRequest payCancelRequest = new PayCancelRequest(PayMethodType.MONEY, ConvenienceType.G25, 1000);

        //when
        PayCancelResponse payCancelResponse = conveniencePayService.payCancel(payCancelRequest);

        //then
        assertEquals(PayCancelResult.PAY_CANCEL_SUCCESS, payCancelResponse.getPayCancelResult());
        assertEquals(1000, payCancelResponse.getPayCanceledAmount());
    }
    @Test
    void pay_cancel_fail() {
        //given
        PayCancelRequest payCancelRequest = new PayCancelRequest(PayMethodType.MONEY, ConvenienceType.G25, 99);

        //when
        PayCancelResponse payCancelResponse = conveniencePayService.payCancel(payCancelRequest);

        //then
        assertEquals(PayCancelResult.PAY_CANCEL_FAIL, payCancelResponse.getPayCancelResult());
        assertEquals(0, payCancelResponse.getPayCanceledAmount());
    }
}