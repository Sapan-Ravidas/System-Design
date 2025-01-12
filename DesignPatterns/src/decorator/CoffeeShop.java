package decorator;

import decorator.components.Beverage;
import decorator.concrete_components.coffees.HouseBlend;
import decorator.concrete_components.condiments.Milk;
import decorator.concrete_components.condiments.Soy;
import decorator.concrete_components.condiments.Whip;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage beverage1 = new Whip(new Milk(new Soy(new HouseBlend())));
        beverage1.info();
    }
    
}

/**
 * 0.89
 * 0.10
 * 0.15
 * 0.10
 */
