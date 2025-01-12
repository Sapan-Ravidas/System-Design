package factory.pizzas.factory;

import factory.pizzas.concrete_products.CheesePizza;
import factory.pizzas.concrete_products.ClamPizza;
import factory.pizzas.product.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
