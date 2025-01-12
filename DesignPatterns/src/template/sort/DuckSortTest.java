package template.sort;

import java.util.Arrays;

public class DuckSortTest {
    public static void main(String[] args) {
        Duck[] ducks = {
            new Duck("Daffy", 8),
            new Duck("Dewey", 2),
            new Duck("Howard", 7),
            new Duck("Louie", 2),
            new Duck("Donald", 10),
            new Duck("Houey", 2)
        };

        Arrays.sort(ducks); /* inplace-sorting */

        for (Duck d: ducks) {
            System.out.print(d + ", ");
        }
    }
}
