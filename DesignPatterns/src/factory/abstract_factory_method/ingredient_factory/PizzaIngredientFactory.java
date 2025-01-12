package factory.abstract_factory_method.ingredient_factory;

import java.util.List;

import factory.abstract_factory_method.ingredients.Cheese;
import factory.abstract_factory_method.ingredients.Clams;
import factory.abstract_factory_method.ingredients.Dough;
import factory.abstract_factory_method.ingredients.Sauce;
import factory.abstract_factory_method.ingredients.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Clams createClams();
    public Cheese createCheese();
    public List<Veggies> createVeggies();
}
