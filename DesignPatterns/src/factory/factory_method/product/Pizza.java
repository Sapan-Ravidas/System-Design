package factory.factory_method.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }
    public String getDough() {
        return dough;
    }
    public String getSauce() {
        return sauce;
    }
    public List<String> getToppings() {
        return toppings;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDough(String dough) {
        this.dough = dough;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void prepare() {
        System.out.println("prepraring + " + getName());
    }

    public void bake() {
        System.out.println("baking " + getName());
    }

    public void cut() {
        System.out.println("cutting " + getName());
    }

    public void box() {
        System.out.println("putting into box " + getName());
    }

    public void addToppings(String topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getName() + "-" + getDough() + "-" + getSauce() + "-");
        builder.append(getToppings());
        return builder.toString();
    }
}
