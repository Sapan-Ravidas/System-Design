package vendor.payment;

import vendor.strategy.PaymentStragery;

public class CardPayentClient implements PaymentGateway{
    private PaymentStragery paymentStragery;
    public CardPayentClient(PaymentStragery paymentStragery) {
        this.paymentStragery = paymentStragery;
    }

    @Override
    public boolean processPayment(double amount) {
        return paymentStragery.processPayment(amount);
    }
    
}
