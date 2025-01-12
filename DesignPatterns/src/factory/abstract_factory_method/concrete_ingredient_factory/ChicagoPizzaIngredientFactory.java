package factory.abstract_factory_method.concrete_ingredient_factory;

import java.util.ArrayList;
import java.util.List;

import factory.abstract_factory_method.concrete_ingredients.EggPlant;
import factory.abstract_factory_method.concrete_ingredients.FreshClams;
import factory.abstract_factory_method.concrete_ingredients.Garlic;
import factory.abstract_factory_method.concrete_ingredients.MarinaraCheese;
import factory.abstract_factory_method.concrete_ingredients.ThinCrustDough;
import factory.abstract_factory_method.concrete_ingredients.TomatoSauce;
import factory.abstract_factory_method.ingredient_factory.PizzaIngredientFactory;
import factory.abstract_factory_method.ingredients.Cheese;
import factory.abstract_factory_method.ingredients.Clams;
import factory.abstract_factory_method.ingredients.Dough;
import factory.abstract_factory_method.ingredients.Sauce;
import factory.abstract_factory_method.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Cheese createCheese() {
        return new MarinaraCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        List<Veggies> veggies = new ArrayList<>();
        veggies.add(new EggPlant());
        veggies.add(new Garlic());
        return veggies;
    }
    
}
