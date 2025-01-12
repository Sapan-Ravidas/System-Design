package iterator.generics;

import iterator.example1.menu.DinerMenu;
import iterator.example1.menu.Menu;
import iterator.example1.menu.PancakeHouseMenu;

public class MenuTest {
    public static void main(String[] args) {
        /*
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        Iterator breakfastItemIterator = breakfastItems.iterator();
        System.out.println(pancakeHouseMenu);
        while (breakfastItemIterator.hasNext()) {
            System.out.println(breakfastItemIterator.next());
            System.out.println();
        }

        System.out.println("\n\n");

        DinerMenu dinerMenu = new DinerMenu();
        System.out.println(dinerMenu);
        MenuItem[] lunchItems = dinerMenu.getMenuItems();
       */

       Menu pancakeHouseMenu = new PancakeHouseMenu();
       Menu dinerMenu = new DinerMenu();

       Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
       waitress.printMenu();

    }   
}
