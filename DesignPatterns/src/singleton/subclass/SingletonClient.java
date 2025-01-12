package singleton.subclass;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton heater = HeaterSingleton.getInstance();
        Singleton cooler = CoolerSingleton.getInstance();
        System.out.println(heater);
        System.out.println(cooler);
    }   
}
