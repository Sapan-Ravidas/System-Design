package composite.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import composite.component.MenuComponent;
import composite.iterator.CompositeIterator;

public class Menu extends MenuComponent{
    Iterator<MenuComponent> iterator = null;
    private List<MenuComponent> menuList = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChildComponent(int i) {
        return menuList.get(i);
    }

    public List<MenuComponent> getMenuList() {
        return menuList;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName() + "\t" + getDescription());
        Iterator<MenuComponent> iterator = menuList.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            component.print();
        }

        System.out.println();
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuList.iterator());
        }
        return iterator;
    }
    
}
