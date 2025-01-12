package payment.adapter;

import payment.gateway.DigitalPaymentClient;
import payment.gateway.PaymentGateway;

public class DigitalPaymentAdapter implements PaymentGateway{
    private DigitalPaymentClient digitalPaymentClient;

    @Override
    public boolean processPayment(double amount) {
        return digitalPaymentClient.processPayment(amount);
    }
    
}
