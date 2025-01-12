package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class NYStyleCheesePizaa extends Pizza {
    public NYStyleCheesePizaa() {
        setName("NY Style Sauce and Cheese Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");
 
		addToppings("Grated Reggiano Cheese");
    }
}
