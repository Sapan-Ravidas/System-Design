package payment.strategy;

public class CardPayment implements PaymentStrategy {

    @Override
    public boolean processPayment(double amount) {
        return true;
    }
    
}
