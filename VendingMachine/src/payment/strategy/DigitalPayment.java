package payment.strategy;

public class DigitalPayment implements PaymentStrategy {

    @Override
    public boolean processPayment(double amount) {
        return true;
    }
    
}
