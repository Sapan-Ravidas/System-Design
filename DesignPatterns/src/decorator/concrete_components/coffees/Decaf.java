package decorator.concrete_components.coffees;

import decorator.components.Beverage;

public class Decaf extends Beverage {
    
    public Decaf() {
        setDescription("Decaf coffee");
    }

    @Override
    public float cost() {
        return 1.05f;
    }
}
