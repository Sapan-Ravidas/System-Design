package state.simple;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);
        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        System.out.println(machine);
    }
}
