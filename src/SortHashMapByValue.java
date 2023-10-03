package BT_SS12;

import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo một HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử vào HashMap
        hashMap.put("apple", 10);
        hashMap.put("banana", 5);
        hashMap.put("cherry", 15);
        hashMap.put("date", 3);

        // Bước 2: Tạo danh sách các cặp key-value từ HashMap
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // Bước 3: Sắp xếp danh sách các phần tử theo giá trị tăng dần
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        // Bước 4: Duyệt qua danh sách đã sắp xếp và in ra các phần tử và giá trị của chúng
        System.out.println("HashMap được sắp xếp theo giá trị tăng dần:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
