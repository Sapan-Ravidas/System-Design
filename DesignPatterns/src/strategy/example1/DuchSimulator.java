package strategy.example1;

import strategy.example1.concreteproducts.DecoyDuck;
import strategy.example1.concreteproducts.MallardDuck;
import strategy.example1.concreteproducts.RubberDuck;
import strategy.example1.concreteproducts.Swan;
import strategy.example1.product.Duck;

public class DuchSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        System.out.println();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();

        System.out.println();

        Duck swan = new Swan();
        swan.display();
        swan.performQuack();
        swan.performFly();
    }
}
