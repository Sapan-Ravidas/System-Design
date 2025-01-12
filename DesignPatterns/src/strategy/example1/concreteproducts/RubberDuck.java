package strategy.example1.concreteproducts;

import strategy.example1.behavior.FlyNoWay;
import strategy.example1.behavior.Squeak;
import strategy.example1.product.Duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    
    @Override
    public void display() {
        System.out.println("I'm rubber duck");
    }
}
