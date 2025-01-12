package factory.factory_method;

import factory.factory_method.concrete_creator.ChicagoPizzaStore;
import factory.factory_method.concrete_creator.NYPizzaStore;
import factory.factory_method.creator.PizzaStore;
import factory.factory_method.product.Pizza;

public class PizzaStoreTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("We've ordered " + pizza1);

        System.out.println();

        Pizza pizza2 = chicagoStore.orderPizza("clam");
        System.out.println("We've ordered " + pizza2);
    }
}
