package subject;

import java.util.List;
import java.util.Map;

import observer.VendingMachineObserver;

public class VendingMachine implements IVendingMachine{
    private Map<String, Integer> stock;
    private List<VendingMachineObserver> observers;

    public void dispenseProduct(String product) {
        int currentStock = stock.getOrDefault(product, 0);
        if (currentStock > 0) {
            stock.put(product, currentStock - 1);
        } else {
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(VendingMachineObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (VendingMachineObserver observer : observers) {
            for (Map.Entry<String, Integer> entry : stock.entrySet()) {
                observer.update(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public void removeObserver(VendingMachineObserver observer) {
        observers.remove(observer);
    }


    
}
