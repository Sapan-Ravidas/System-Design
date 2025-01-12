package template.simple_template.concrete_object;

import template.simple_template.template.CaffeineBeverage;

public class Tea extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("adding lemon");
    }

    @Override
    public void addCondiments() {
        System.out.println("steeping the tea");
    }
}
