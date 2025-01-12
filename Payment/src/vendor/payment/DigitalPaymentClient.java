package vendor.payment;

import vendor.strategy.PaymentStragery;

public class DigitalPaymentClient implements PaymentGateway {
    private PaymentStragery paymentStragery;

    public DigitalPaymentClient(PaymentStragery paymentStragery) {
        this.paymentStragery = paymentStragery;
    }

    @Override
    public boolean processPayment(double amount) {
        return paymentStragery.processPayment(amount);
    }
}
