package iterator.example1;

import iterator.example1.iterator.ItemIterator;
import iterator.example1.menu.Menu;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        ItemIterator pancakes = pancakeHouseMenu.createIterator();
        ItemIterator diners = dinerMenu.createIterator();

        System.out.println("BreakFast");
        printMenu(pancakes);
        System.out.println("\nLunch");
        printMenu(diners);
        
    }
    
    private void printMenu(ItemIterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
