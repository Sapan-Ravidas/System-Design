package vendor.strategy;

public class CardPaymentStrategy implements PaymentStragery{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Card Payment Successful!");
        return true;
    }
}
