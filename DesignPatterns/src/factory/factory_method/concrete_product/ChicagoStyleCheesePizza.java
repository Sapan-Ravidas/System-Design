package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    
    public ChicagoStyleCheesePizza() {
        setName("Chicago Style Deep Dish Cheese Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");
 
		addToppings("Shredded Mozzarella Cheese");
    }
}
