package factory.abstract_factory_method.concrete_ingredient_factory;

import java.util.Arrays;
import java.util.List;

import factory.abstract_factory_method.concrete_ingredients.BlackOlives;
import factory.abstract_factory_method.concrete_ingredients.FrozenClam;
import factory.abstract_factory_method.concrete_ingredients.Garlic;
import factory.abstract_factory_method.concrete_ingredients.MozarellaCheese;
import factory.abstract_factory_method.concrete_ingredients.ThickCrustDough;
import factory.abstract_factory_method.concrete_ingredients.TomatoSauce;
import factory.abstract_factory_method.ingredient_factory.PizzaIngredientFactory;
import factory.abstract_factory_method.ingredients.Cheese;
import factory.abstract_factory_method.ingredients.Clams;
import factory.abstract_factory_method.ingredients.Dough;
import factory.abstract_factory_method.ingredients.Sauce;
import factory.abstract_factory_method.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Clams createClams() {
        return new FrozenClam();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        Veggies[] veggies = {new Garlic(), new BlackOlives()};
        return Arrays.asList(veggies);
    }
    
}
