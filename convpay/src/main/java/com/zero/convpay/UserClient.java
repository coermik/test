package com.zero.convpay;

import com.zero.convpay.dto.PayCancelRequest;
import com.zero.convpay.dto.PayCancelResponse;
import com.zero.convpay.dto.PayRequest;
import com.zero.convpay.dto.PayReseponse;
import com.zero.convpay.service.ConveniencePayService;
import com.zero.convpay.type.ConvenienceType;
import com.zero.convpay.type.PayMethodType;

public class UserClient {
    public static void main(String[] args) {
        // 사용자 -> 편결이 -> 머니

        ConveniencePayService conveniencePayService = new ConveniencePayService();

        // G25, 결제 1000원
        PayRequest payRequest = new PayRequest(PayMethodType.CARD, ConvenienceType.G25, 1000);
        PayReseponse payReseponse = conveniencePayService.pay(payRequest);

        System.out.println(payReseponse);
        // G25, 취소 500원
        PayCancelRequest payCancelRequest = new PayCancelRequest(PayMethodType.MONEY, ConvenienceType.G25, 500);
        PayCancelResponse payCancelResponse = conveniencePayService.payCancel(payCancelRequest);


    }
}
