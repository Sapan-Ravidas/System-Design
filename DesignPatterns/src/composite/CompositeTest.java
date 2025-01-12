package composite;

import composite.client.Waitress;
import composite.component.MenuComponent;
import composite.composite.Menu;
import composite.leaf.MenuItem;

public class CompositeTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMeu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert of course");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined...");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMeu);

        pancakeHouseMenu.add(new MenuItem("K&B pancake breakfast", 
        "pancake with srambled eggs and toast", 
        false, 
        2.99));

        pancakeHouseMenu.add(new MenuItem("regult pancake breakfast",
         "pancakes with fried eggs and sausage", 
         false, 
         2.99));

        pancakeHouseMenu.add(new MenuItem("Blueberry pancakes", 
        "pancakes made with fresh blue-berries", 
        true, 
        3.49));

        pancakeHouseMenu.add(new MenuItem("waffles", 
        "waffles with your choice of blueberries or strawberries", 
        true, 
        3.59));

        dinerMenu.add(new MenuItem("Veg BLT",
        "(Fakin) Bacon with lettuce & tomato on whole wheat", 
        false,
        2.99));

        dinerMenu.add(new MenuItem("BLT", 
        "Bacon with lettuce & tomato on whole wheat, false, MAX_ITEMS",
        false,
        3.29));

        dinerMenu.add(new MenuItem("Soup of the day", 
        "Soup of the day, with a side of potatao salad", 
        false, 
        3.99));

        dinerMenu.add(new MenuItem("Hotdog", 
        "A hot dog, with a sauerkraut, relish, onios, topped with cheese", 
        true, 
        3.05));

        dinerMenu.add(new MenuItem("Steamed veg and brown salad", 
        "Steamed vegetables and brown rice", 
        true, 
        3.79));

        dinerMenu.add(new MenuItem("Pasta", 
        "Speghetti with Marinara Sauce and a slice of sourdoigh bread", 
        true, 
        3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie",
        "Apple Pie with a flaky crust, topped with vanilla icecream",
        true,
        1.59));

        dessertMenu.add(new MenuItem("Cheesecake",
        "Creamy newyork cheesecake, with a chocolate graham crust",
        true,
        1.99));

        dessertMenu.add(new MenuItem("Sorbet",
        "A scoop of rasberry and a scoop of lime",
        true,
        1.59));

        cafeMeu.add(new MenuItem("Veggie Burger and Air Fries",
        "Veggie burger on a whole wheat bun, lettuce, tomato and fries",
        true,
        3.99));

        cafeMeu.add(new MenuItem("Soup of the day",
        "A cup of the soup of the day, with a side salad",
        true,
        3.69));

        cafeMeu.add(new MenuItem("Burrito",
        "A large burrito, with whole plinto beans, salsa guacamole",
        true,
        4.29));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
