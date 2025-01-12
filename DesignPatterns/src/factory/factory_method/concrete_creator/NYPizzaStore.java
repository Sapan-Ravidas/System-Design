package factory.factory_method.concrete_creator;

import factory.factory_method.concrete_product.NYStyleCheesePizaa;
import factory.factory_method.concrete_product.NYStyleClamPizza;
import factory.factory_method.creator.PizzaStore;
import factory.factory_method.product.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizaa();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }
    
}
