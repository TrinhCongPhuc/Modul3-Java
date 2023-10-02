package BT_SS10;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ds");
        list.add("ddsas");
        list.add("dsdsa");
        list.add("dsdá");

        for (String str : list) {
            if (str.length() > 3) {
                System.out.println(str);
            }
        }
    }
}
