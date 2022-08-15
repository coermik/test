package com.zero.convpay.service;

import com.zero.convpay.dto.*;
import com.zero.convpay.type.*;

public class ConveniencePayService { //편결이
    private final MoneyAdapter moneyAdapter = new MoneyAdapter();
    private final CardAdapter cardAdapter = new CardAdapter();
//    private final PointAdapter pointAdapter = new CardAdapter();
    public PayReseponse pay(PayRequest payRequest){
        PaymentInterface paymentInterface;

        if (payRequest.getPayMethodType() == PayMethodType.CARD){
            paymentInterface = cardAdapter;
        } else {
            paymentInterface = moneyAdapter;
        }
//        else if (payRequest.getPayMethodType() == PayMethodType.MONEY) {
//            paymentInterface = moneyAdapter;
//        }
//        else {
//            paymentInterface = pointAdapter;
//        }


    /*    CardUseResult cardUseResult;
        MoneyUseResult moneyUseResult;
        if (payRequest.getPayMethodType() == PayMethodType.CARD){
            cardAdapter.authorization();
            cardAdapter.approval();
            cardUseResult = cardAdapter.capture(payRequest.getPayAmount());
        } else{
            moneyUseResult =
                    moneyAdapter.use(payRequest.getPayAmount());
        }
    */
        PaymentResult payment = paymentInterface.payment(payRequest.getPayAmount());

        if (payment == PaymentResult.PAYMENT_FAIL) {
            return new PayReseponse(PayResult.FAIL, 0);
        }

        // Success Case
        return new PayReseponse(PayResult.SUCCESS, payRequest.getPayAmount());

    }

    public PayCancelResponse payCancel(PayCancelRequest payCancelRequest){
        PaymentInterface paymentInterface;

        if (payCancelRequest.getPayMethodType() == PayMethodType.CARD){
            paymentInterface = cardAdapter;
        } else {
            paymentInterface = moneyAdapter;
        }

        CancelPaymentResult cancelPaymentResult = paymentInterface.cancelPayment(
                payCancelRequest.getPayCancelAmount());

        if (cancelPaymentResult == CancelPaymentResult.CANCEL_PAYMENT_FAIL){
            return new PayCancelResponse(PayCancelResult.PAY_CANCEL_FAIL, 0);
        }

        // SUccess Case
        return new PayCancelResponse(PayCancelResult.PAY_CANCEL_SUCCESS,
                payCancelRequest.getPayCancelAmount());
    }

}
