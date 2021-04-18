package learn.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Iterator & Iterable
 */
public class App {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(null);
        integerList.add(-55);
        integerList.add(3);

//      Iterable through foreach loop
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        System.out.println();

//      Iterator used
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
