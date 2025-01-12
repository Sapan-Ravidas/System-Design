package singleton.subclass;

public class Singleton {
    private static Singleton instance;

    protected Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
