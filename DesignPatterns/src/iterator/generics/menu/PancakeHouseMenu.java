package iterator.generics.menu;

import java.util.ArrayList;
import java.util.List;

import iterator.example1.iterator.ItemIterator;
import iterator.example1.iterator.PancakeItemIterator;
import iterator.example1.menu_item.MenuItem;

public class PancakeHouseMenu implements Menu{
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B pancake breakfast", 
        "pancake with srambled eggs and toast", 
        false, 
        2.99);

        addItem("regult pancake breakfast",
         "pancakes with fried eggs and sausage", 
         false, 
         2.99);

        addItem("Blueberry pancakes", 
        "pancakes made with fresh blue-berries", 
        true, 
        3.49);

        addItem("waffles", 
        "waffles with your choice of blueberries or strawberries", 
        true, 
        3.59);
        
    }

    public void addItem(String name, String description, boolean veg, double price) {
        MenuItem menuItem = new MenuItem(name, description, veg, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public ItemIterator createIterator() {
        return new PancakeItemIterator(menuItems);
    }

    @Override
    public String toString() {
        return "Pancake House Menu";
    }
}
