package adapter;

import vendor.payment.PaymentGateway;

public class CardPaymentAdapter implements PaymentGateway {

    private PaymentGateway gateway;

    public CardPaymentAdapter(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public boolean processPayment(double amount) {
        return gateway.processPayment(amount);
    }
    
}
