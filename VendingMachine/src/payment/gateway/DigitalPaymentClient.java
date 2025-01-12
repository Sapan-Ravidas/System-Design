package payment.gateway;

import payment.strategy.PaymentStrategy;

public class DigitalPaymentClient {

    private PaymentStrategy paymentStrategy;

    public DigitalPaymentClient(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean processPayment(double amount) {
        return paymentStrategy.processPayment(amount);
    }
}
