package factory.abstract_factory_method.concrete_product;

import factory.abstract_factory_method.ingredient_factory.PizzaIngredientFactory;
import factory.abstract_factory_method.product.Pizza;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setCheese(pizzaIngredientFactory.createCheese());
        setSauce(pizzaIngredientFactory.createSauce());
        setClam(pizzaIngredientFactory.createClams());
    }    
    
}
