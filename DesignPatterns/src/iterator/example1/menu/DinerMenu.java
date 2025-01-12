package iterator.example1.menu;

import iterator.example1.iterator.DinerMenuIterator;
import iterator.example1.iterator.ItemIterator;
import iterator.example1.menu_item.MenuItem;

public class DinerMenu implements Menu{
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Veg BLT",
        "(Fakin) Bacon with lettuce & tomato on whole wheat", 
        false,
        2.99);

        addItem("BLT", 
        "Bacon with lettuce & tomato on whole wheat, false, MAX_ITEMS",
        false,
        3.29);

        addItem("Soup of the day", 
        "Soup of the day, with a side of potatao salad", 
        false, 
        3.99);

        addItem("Hotdog", 
        "A hot dog, with a sauerkraut, relish, onios, topped with cheese", 
        true, 
        3.05);

        addItem("Steamed veg and brown salad", 
        "Steamed vegetables and brown rice", 
        true, 
        3.79);

        addItem("Pasta", 
        "Speghetti with Marinara Sauce and a slice of sourdoigh bread", 
        true, 
        3.89);

    }

    public void addItem(String name, String description, boolean veg, double price) {
        MenuItem menuItem = new MenuItem(name, description, veg, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can;t add items to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            ++ numberOfItems;
        }
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        return "Diner Menu";
    }

    @Override
    public ItemIterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}   
