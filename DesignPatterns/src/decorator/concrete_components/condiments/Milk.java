package decorator.concrete_components.condiments;

import decorator.components.Beverage;

public class Milk extends Beverage {

    private Beverage beverage;
    
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public float cost() {
        return beverage.cost() + 0.10f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + milk";
    }
}
