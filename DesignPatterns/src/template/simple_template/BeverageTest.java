package template.simple_template;

import template.simple_template.concrete_object.CoffeWithHook;
import template.simple_template.concrete_object.Coffee;
import template.simple_template.concrete_object.Tea;
import template.simple_template.concrete_object.TeaWithHook;

public class BeverageTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareReciepe();
        System.out.println();
        coffee.prepareReciepe();

        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeWithHook coffeeWithHook = new CoffeWithHook();

        System.out.println();
        teaWithHook.prepareReciepe();
        System.out.println();
        coffeeWithHook.prepareReciepe();

    }
}
