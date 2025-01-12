package template.simple_template.template;

public abstract class CaffieneBeverageWithHook {
    public final void prepareReciepe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    private void boilWater() {
        System.out.println("boiling water");
    }

    private void pourInCup() {
        System.out.println("pour in the cup");
    }

    public boolean customerWantsCondiments() {
        return true;
    }

}
