package strategy.example1.behavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("skeak...");
    }
}
