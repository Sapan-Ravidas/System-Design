package iterator.example1.iterator;

import java.util.List;

import iterator.example1.menu_item.MenuItem;

public class PancakeItemIterator implements ItemIterator {

    private List<MenuItem> items;
    private int position;

    public PancakeItemIterator(List<MenuItem> items) {
        this.items = items;
    }

    public List<MenuItem> getItems() {
        return items;
    }
    
    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public MenuItem next() {
        return items.get(position ++);
    }
}
