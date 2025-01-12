package model;

public class Snake {
    private int start;
    private int end;
    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }
    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Snake(" + start + ", " + end + ")";
    }
}