package iterator.generics.iterator;

import iterator.example1.menu_item.MenuItem;

public class DinerMenuIterator implements ItemIterator{
    private MenuItem[] items;
    private int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
}
