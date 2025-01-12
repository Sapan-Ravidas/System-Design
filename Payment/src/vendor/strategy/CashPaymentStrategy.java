package vendor.strategy;

public class CashPaymentStrategy implements PaymentStragery{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Cash payment successfull!");
        return true;    
    }
    
}
