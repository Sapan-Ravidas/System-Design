package decorator.components;

public abstract class Beverage {
    private String description = "unknown";

    public abstract float cost();

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void info() {
        /**
         * System.out.println(description) will print "unknown"
         */
        System.out.println(getDescription());
        System.out.println("cost:" + cost());
    }

}
