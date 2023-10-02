package BT_SS10;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortAndPrintList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 20));
        }

        System.out.println("Original List: " + myList);

        Collections.sort(myList);

        System.out.println("Sorted List: " + myList);
    }
}
