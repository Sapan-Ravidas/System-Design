package state;

import models.PaymentType;

public interface MachineState {
    void selectProduct(int shelfCode);
    void cancelPayment(String transactionId);
    void makePayment(String transactionId, PaymentType paymentType);
    void dispenseProduct(String transactionId);
}