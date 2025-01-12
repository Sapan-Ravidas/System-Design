package vendor.strategy;

public class DigitalPaymentStrategy implements PaymentStragery{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Digital Payment successfull!");
        return true;    
    }
    
}
