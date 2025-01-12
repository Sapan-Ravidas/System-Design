package payment.gateway;

public interface PaymentGateway {
    boolean processPayment(double amount);
}
