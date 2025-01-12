package payment.gateway;

import payment.strategy.PaymentStrategy;

public class CardPaymentClient {
    private PaymentStrategy paymentStrategy;

    public CardPaymentClient(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean executeTransaction(double amount) {
        return paymentStrategy.processPayment(amount);
    }
}
