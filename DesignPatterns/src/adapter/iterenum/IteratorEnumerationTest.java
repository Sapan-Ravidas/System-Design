package adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class IteratorEnumerationTest {
    public static void main(String[] args) {
        // String[] argsList = {"hello", "hi", "hey"};
        List<String> list = new ArrayList<>(Arrays.asList(args));
        Enumeration<String> enumeration = new IteratorEnumeration(list.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
