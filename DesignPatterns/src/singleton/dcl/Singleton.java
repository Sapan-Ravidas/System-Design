package singleton.dcl;

/**
 * Alert: This implementation of Singleton not guaranteed to work prior to Java5
 */

public class Singleton {

    /**
     * Note that volatile should not be confused with the static modifier. 
     * static variables are class members that are shared among all objects. 
     * There is only one copy of them in the main memory. 
     */

    private volatile static Singleton instance;
    
    private Singleton() {

    }

    /**
     * double null check with synchronized
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }   
}

/**
 * Java’s synchronized keyword guarantees both mutual exclusion and visibility. 
 * If we make the blocks of threads that modify the value of the shared variable 
 * synchronized only one thread can enter the block and changes made by it will be 
 * reflected in the main memory. All other threads trying to enter the block at the 
 * same time will be blocked and put to sleep. 
 * In some cases, we may only desire visibility and not atomicity. The use of 
 * synchronized in such a situation is overkill and may cause scalability problems. 
 * Here volatile comes to the rescue. Volatile variables have the visibility features 
 * of synchronized but not the atomicity features. The values of the volatile variable 
 * will never be cached and all writes and reads will be done to and from the main memory. 
 * However, the use of volatile is limited to a very restricted set of cases as most of the
 * times atomicity is desired. For example, a simple increment statement such as x = x + 1;
 * or x++ seems to be a single operation but is really a compound read-modify-write sequence
 * of operations that must execute atomically. 
 */
