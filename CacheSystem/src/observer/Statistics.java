package observer;

import cache.ResultType;

public class Statistics implements Observer{
    private int l1HitCount;
    private int l2HitCount;
    private int storageHitCount;
    private int searchCount;

    private void incrementL1Hit() {
        l1HitCount += 1;
    }

    private void incrementL2Hit() {
        l2HitCount += 1;
    }

    private void incrementStorageHit() {
        storageHitCount += 1;
    }

    private void increamentSearchCount() {
        searchCount += 1;
    }

    public void notifySearch() {
        increamentSearchCount();
    }

    public void notifySearch(ResultType resultType) {
        switch (resultType) {
            case L1_HIT:
                incrementL1Hit();
                break;
            case L2_HIT:
                incrementL2Hit();
                break;
            case STORAGE_HIT:
                incrementStorageHit();
                break;
            default:
                break;
        }
    }

    public void displayStats() {
        System.out.println("L1 Cache Hits: " + l1HitCount);
        System.out.println("L2 Cache Hits: " + l2HitCount);
        System.out.println("Primary Store Hits: " + storageHitCount);
        System.out.println("Total Searches: " + searchCount);
    }

    
}
