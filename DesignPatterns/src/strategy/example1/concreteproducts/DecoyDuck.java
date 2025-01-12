package strategy.example1.concreteproducts;

import strategy.example1.behavior.FlyNoWay;
import strategy.example1.behavior.Mute;
import strategy.example1.product.Duck;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Mute());
    }

    @Override
    public void display() {
        System.out.println("I'm decoy duck");
    }
}
