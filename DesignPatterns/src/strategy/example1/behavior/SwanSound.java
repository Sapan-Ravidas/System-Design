package strategy.example1.behavior;

public class SwanSound implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("muffle honk..");
    }    
}
