package model;

public class Ladder {
    private int start;
    private int end;
    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }
    public Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Player(" + start + ", " + end + ")";
    }
}
