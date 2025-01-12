package subject;

import observer.VendingMachineObserver;

public interface IVendingMachine {
    void registerObserver(VendingMachineObserver observer);
    void notifyObservers();
    void removeObserver(VendingMachineObserver observer);
}
