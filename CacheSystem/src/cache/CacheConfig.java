package cache;

public class CacheConfig {
    private static int LRU_CAPACITY = 5;
    private static int LFU_CAPACITY = 20;
    public static int getLRU_CAPACITY() {
        return LRU_CAPACITY;
    }
    public static void setLRU_CAPACITY(int lRU_CAPACITY) {
        LRU_CAPACITY = lRU_CAPACITY;
    }
    public static int getLFU_CAPACITY() {
        return LFU_CAPACITY;
    }
    public static void setLFU_CAPACITY(int lFU_CAPACITY) {
        LFU_CAPACITY = lFU_CAPACITY;
    }
}
