package factory.abstract_factory_method.concrete_store;

import factory.abstract_factory_method.concrete_ingredient_factory.NYPizzaIngredientFactory;
import factory.abstract_factory_method.concrete_product.CheesePizza;
import factory.abstract_factory_method.concrete_product.ClamPizza;
import factory.abstract_factory_method.concrete_product.VeggiesPizza;
import factory.abstract_factory_method.product.Pizza;
import factory.abstract_factory_method.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    private NYPizzaIngredientFactory factory;

    public NYPizzaStore() {
        factory = new NYPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("NY Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("NY Style Clam Pizza");
        } else if (type.equals("veg")) {
            pizza = new VeggiesPizza(factory);
            pizza.setName("NY Style Veggies Pizza");
        }
        return pizza;
    }
    
}
