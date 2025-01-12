package vendor.payment;

import vendor.strategy.PaymentStragery;

public class CashPaymentClient implements PaymentGateway{
    private PaymentStragery paymentStragery;

    public CashPaymentClient(PaymentStragery paymentStragery) {
        this.paymentStragery = paymentStragery;
    }

    @Override
    public boolean processPayment(double amount) {
        return paymentStragery.processPayment(amount);
    }
    
}
