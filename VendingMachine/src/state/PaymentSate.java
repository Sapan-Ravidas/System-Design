package state;

import models.PaymentType;

public class PaymentSate implements MachineState {

    @Override
    public void selectProduct(int shelfCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProduct'");
    }

    @Override
    public void cancelPayment(String transactionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelPayment'");
    }

    @Override
    public void makePayment(String transactionId, PaymentType paymentType) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePayment'");
    }

    @Override
    public void dispenseProduct(String transactionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }
    
}
