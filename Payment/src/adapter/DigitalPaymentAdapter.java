package adapter;

import vendor.payment.PaymentGateway;

public class DigitalPaymentAdapter implements PaymentGateway {

    private PaymentGateway paymentGateway;

    public DigitalPaymentAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public boolean processPayment(double amount) {
        return paymentGateway.processPayment(amount);
    }
    
}
