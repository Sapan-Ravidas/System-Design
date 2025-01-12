package factory.pizzas.concrete_products;

import factory.pizzas.product.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        setName("Cheese Pizza");
        setDough("regular crust");
        setSauce("mariana pizaa sauce");
        addToppings("Mozzarella");
        addToppings("parmesan");
    }
}
