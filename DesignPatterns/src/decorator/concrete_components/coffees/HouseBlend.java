package decorator.concrete_components.coffees;

import decorator.components.Beverage;

public class HouseBlend extends Beverage{

    @Override
    public float cost() {
        return 0.89f;
    }

    public HouseBlend() {
        setDescription("HouseBlend Coffee");
    }
    
}
