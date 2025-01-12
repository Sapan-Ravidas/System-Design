package strategy.example1.behavior;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MUTE");
    }
}
