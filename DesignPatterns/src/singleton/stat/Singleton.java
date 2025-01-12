package singleton.stat;

public class Singleton {
    private static Singleton instance = new Singleton(); // Eagerly created instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public String getDescription() {
        return "I'm statically(eagerly) initialized Singleton";
    }
}
