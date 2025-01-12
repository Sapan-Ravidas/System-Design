package decorator.concrete_components.condiments;

import decorator.components.Beverage;

public class Whip extends Beverage {
    
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.10f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + whip";
    }

}
