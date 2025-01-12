package factory.factory_method.concrete_creator;

import factory.factory_method.concrete_product.ChicagoStyleCheesePizza;
import factory.factory_method.concrete_product.ChicagoStyleClamPizza;
import factory.factory_method.creator.PizzaStore;
import factory.factory_method.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        }
        return pizza;
    }
    
}
