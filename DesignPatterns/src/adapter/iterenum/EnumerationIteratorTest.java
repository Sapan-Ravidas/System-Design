package adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTest {
    public static void main(String[] args) {
        // String[] argsList = {"hello", "hi", "hey"};
        Vector<String> vector = new Vector<String>(Arrays.asList(args));
        Iterator<String> iterator = new EnumerationIterator(vector.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
