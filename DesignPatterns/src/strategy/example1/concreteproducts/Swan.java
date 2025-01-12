package strategy.example1.concreteproducts;

import strategy.example1.behavior.FlyWithRocetPower;
import strategy.example1.behavior.SwanSound;
import strategy.example1.product.Duck;

public class Swan extends Duck{

    public Swan() {
        setFlyBehavior(new FlyWithRocetPower());
        setQuackBehavior(new SwanSound());
    }

    @Override
    public void display() {
        System.out.println("I'm a swan");
    }
}
