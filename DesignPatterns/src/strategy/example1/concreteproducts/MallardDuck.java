package strategy.example1.concreteproducts;

import strategy.example1.behavior.FlyWithWings;
import strategy.example1.behavior.Quack;
import strategy.example1.product.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm MallardDuck");
    }
    
}
