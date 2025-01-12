package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * adapting enumator to an iterator
 */
public class EnumerationIterator implements Iterator{

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
    
}
