package adapter.object_adapter;

import adapter.object_adapter.adapter.TurkeyAdapter;
import adapter.object_adapter.client.Duck;
import adapter.object_adapter.client.MallardDuck;
import adapter.object_adapter.vendor.Turkey;
import adapter.object_adapter.vendor.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdaper = new TurkeyAdapter(turkey);

        System.out.println("turkey says");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck says");
        testDuck(duck);

        System.out.println("\nthe TurkeyDapter says");
        testDuck(turkeyAdaper);

    }

    /**
     * our existing system implementation that we don't to disturb
     * @param duck
     */
    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
