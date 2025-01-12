package state.simple;

public class GumballMachine {
    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 2;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public int getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("you can't insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("you insert a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("you can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter return");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("you haven't inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("sorry, you already turned the crank");
        } else if (state == SOLD) {
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("Your turned...");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            System.out.println("you turned, but there is no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("you turned, but there are no gumballs");
        } else if (state == SOLD) {
            System.out.println("Turning twice doesn;t get you another gumball");
        }
    }

    public void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        } else if (state == NO_QUARTER) {
            System.out.println("you need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            -- count;
            if (count == 0) {
                System.out.println("Oops, out of gumball!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        }
    }

    public void refill(int count) {
        this.count = count;
        state = NO_QUARTER;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Machine is ");
        if (state == HAS_QUARTER) {
            sb.append("waiting for turn of crank");
        } else if (state == NO_QUARTER) {
            sb.append("waiting for quarter");
        } else if (state == SOLD_OUT) {
            sb.append("sold out");
        } else if (state == SOLD) {
            sb.append("delivering a gumball");
        }
        sb.append("\n");
        return sb.toString();
    }
}
