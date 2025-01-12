package factory.abstract_factory_method;

import factory.abstract_factory_method.concrete_store.ChicagoPizzaStore;
import factory.abstract_factory_method.concrete_store.NYPizzaStore;
import factory.abstract_factory_method.store.PizzaStore;
import factory.abstract_factory_method.product.Pizza;;

public class PizzaStoreTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizaa1 = nyStore.orderPizza("cheese");
        System.out.println("We've ordered " + pizaa1);

        System.out.println();

        Pizza pizza2 = nyStore.orderPizza("veg");
        System.out.println("We've ordered " + pizza2);

        System.out.println();

        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza3 = chicagoStore.orderPizza("clam");
        System.out.println("We've ordered " + pizza3);
    }
}
