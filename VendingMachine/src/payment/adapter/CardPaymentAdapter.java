package payment.adapter;

import payment.gateway.CardPaymentClient;
import payment.gateway.PaymentGateway;

public class CardPaymentAdapter implements PaymentGateway {
    private CardPaymentClient cardPaymentClient;

    @Override
    public boolean processPayment(double amount) {
        return cardPaymentClient.executeTransaction(amount);
    }
    
}
