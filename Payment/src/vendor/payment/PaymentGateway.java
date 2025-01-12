package vendor.payment;

public interface PaymentGateway {
    public boolean processPayment(double amount);
}
