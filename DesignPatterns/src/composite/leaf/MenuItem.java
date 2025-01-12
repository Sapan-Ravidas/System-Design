package composite.leaf;

import java.util.Iterator;

import composite.component.MenuComponent;
import composite.iterator.NullIterator;

public class MenuItem extends MenuComponent{

    private String name;
    private String description;
    private boolean veg;
    private double price;

    public MenuItem(String name, String description, boolean veg, double price) {
        this.name = name;
        this.description = description;
        this.veg = veg;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVeg() {
        return veg;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", $" + price + ", " + description;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
    
}
