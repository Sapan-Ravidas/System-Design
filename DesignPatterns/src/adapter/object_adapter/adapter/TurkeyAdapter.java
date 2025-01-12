package adapter.object_adapter.adapter;

import adapter.object_adapter.client.Duck;
import adapter.object_adapter.vendor.Turkey;

/**
 * to use vendor in our existing system
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; ++ i)
            turkey.fly();
    }
}
