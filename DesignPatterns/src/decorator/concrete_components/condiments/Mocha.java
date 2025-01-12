package decorator.concrete_components.condiments;

import decorator.components.Beverage;

public class Mocha extends Beverage {
    
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.20f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + mocha";
    }
    
}
