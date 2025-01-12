package service;

import adapter.CardPaymentAdapter;
import adapter.DigitalPaymentAdapter;
import models.PaymentType;
import vendor.payment.CardPayentClient;
import vendor.payment.CashPaymentClient;
import vendor.payment.DigitalPaymentClient;
import vendor.payment.PaymentGateway;
import vendor.strategy.CardPaymentStrategy;
import vendor.strategy.CashPaymentStrategy;
import vendor.strategy.DigitalPaymentStrategy;

public class PaymentService {
    public boolean makePayment(PaymentType paymentType, double amounnt) {
        switch (paymentType) {
            case PaymentType.CARD:
                return (new CardPaymentAdapter(getPaymentGateway(paymentType)))
                    .processPayment(amounnt);
            case PaymentType.CASH:
                return (new CardPaymentAdapter(getPaymentGateway(paymentType)))
                    .processPayment(amounnt);
            case PaymentType.UPI:
                return (new DigitalPaymentAdapter(getPaymentGateway(paymentType)))
                    .processPayment(amounnt);
            default:
                return false;
        }
    }

    private PaymentGateway getPaymentGateway(PaymentType paymentType) {
        switch (paymentType) {
            case PaymentType.CASH:
                return new CashPaymentClient(new CashPaymentStrategy());
            case PaymentType.UPI:
                return new DigitalPaymentClient(new DigitalPaymentStrategy());
            case PaymentType.CARD:
                return new CardPayentClient(new CardPaymentStrategy());
            default:
                return null;
        }
    }
}
