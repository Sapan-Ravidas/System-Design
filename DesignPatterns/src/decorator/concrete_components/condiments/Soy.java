package decorator.concrete_components.condiments;

import decorator.components.Beverage;

public class Soy extends Beverage {
    
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;    
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.15f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + soy";
    }
}
