package cache;

public enum CacheLevel {
    L1("L1"),
    L2("L2"),
    PRIMARY_STORAGE("Primary Storage");

    private String value;

    CacheLevel(String value) {
        this.value = value;
    }
} 
