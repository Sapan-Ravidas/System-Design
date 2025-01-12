package template.simple_template.concrete_object;

import template.simple_template.template.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("adding suger and milk");
    }

    @Override
    public void brew() {
        System.out.println("dipping coffee through filter");
    }
}
