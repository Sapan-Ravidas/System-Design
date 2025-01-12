package singleton.threadsafe;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public String getDescription() {
        return "I'm a thread-safe Singleton";
    }
}
