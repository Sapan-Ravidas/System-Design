package template.sort;

public class Duck implements Comparable<Duck>{
    private String name;
    private int weight;
    
    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + weight + ")";
    }

    @Override
    public int compareTo(Duck other) {
        return this.weight - other.weight;
    }
}