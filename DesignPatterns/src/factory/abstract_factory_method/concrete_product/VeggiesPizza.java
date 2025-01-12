package factory.abstract_factory_method.concrete_product;

import factory.abstract_factory_method.ingredient_factory.PizzaIngredientFactory;
import factory.abstract_factory_method.product.Pizza;

public class VeggiesPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiesPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
        setVeggies(pizzaIngredientFactory.createVeggies());
    }
    
}
