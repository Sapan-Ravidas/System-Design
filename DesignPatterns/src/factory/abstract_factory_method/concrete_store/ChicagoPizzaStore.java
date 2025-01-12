package factory.abstract_factory_method.concrete_store;

import factory.abstract_factory_method.concrete_ingredient_factory.ChicagoPizzaIngredientFactory;
import factory.abstract_factory_method.concrete_product.CheesePizza;
import factory.abstract_factory_method.concrete_product.ClamPizza;
import factory.abstract_factory_method.product.Pizza;
import factory.abstract_factory_method.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    private ChicagoPizzaIngredientFactory factory;

    public ChicagoPizzaStore() {
        factory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (type.equals("veg")) {
            pizza = new ClamPizza(factory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
    
}
