package template.simple_template.template;

public abstract class CaffeineBeverage {

    public final void prepareReciepe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void pourInCup() {
        System.out.println("Pour in the cup");
    }
}
