package factory.pizzas;

import factory.pizzas.client.PizzaStore;
import factory.pizzas.factory.SimplePizzaFactory;
import factory.pizzas.product.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        Pizza cheesePizza = store.orderPizza("cheese"); 
        System.out.println("ordered " + cheesePizza);

        Pizza clamPizza = store.orderPizza("clam");
        System.out.println("ordered " + clamPizza);
    }    
}
