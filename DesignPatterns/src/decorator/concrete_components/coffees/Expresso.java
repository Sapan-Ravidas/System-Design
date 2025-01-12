package decorator.concrete_components.coffees;

import decorator.components.Beverage;

public class Expresso extends Beverage {
    
    public Expresso() {
        setDescription("Expresso coffee");
    }

    @Override
    public float cost() {
        return 1.99f;
    }

}
