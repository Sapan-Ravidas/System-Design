package factory.factory_method.concrete_product;

import factory.factory_method.product.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
		setName("Chicago Style Clam Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");
 
		addToppings("Shredded Mozzarella Cheese");
		addToppings("Frozen Clams from Chesapeake Bay");
	}
 
    @Override
    public void cut() {
        System.out.println("cutting pizza into sqaure slices");
    }
}
