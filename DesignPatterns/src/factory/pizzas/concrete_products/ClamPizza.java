package factory.pizzas.concrete_products;

import factory.pizzas.product.Pizza;

public class ClamPizza extends Pizza{
    public ClamPizza() {
        setName("Clam Pizza");
		setDough("Thin crust");
		setSauce("White garlic sauce");
		addToppings("Clams");
		addToppings("Grated parmesan cheese");
    }
}
