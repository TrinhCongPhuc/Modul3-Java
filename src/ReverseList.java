package BT_SS10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
        }

        System.out.println("List: " + list);

        Collections.reverse(list);

        System.out.println("Reverse list: " + list);
    }
}
