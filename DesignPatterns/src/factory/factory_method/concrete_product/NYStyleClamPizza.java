package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class NYStyleClamPizza extends Pizza {
    
    public NYStyleClamPizza() {
        setName("NY Style Clam Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");
 
		addToppings("Grated Reggiano Cheese");
		addToppings("Fresh Clams from Long Island Sound");
    }
}
