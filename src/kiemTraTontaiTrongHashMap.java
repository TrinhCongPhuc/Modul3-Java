package BT_SS12;

import java.util.HashMap;

public class kiemTraTontaiTrongHashMap {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử vào HashMap
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 4);

        // Phần tử cần kiểm tra
        String keyToCheck = "B";

        // Bước 2: Kiểm tra xem phần tử có tồn tại trong HashMap hay không
        boolean ketQua = kiemTraTontaiTrongHashMap(hashMap, keyToCheck);

        if (ketQua) {
            System.out.println("Phần tử '" + keyToCheck + "' tồn tại trong HashMap.");
        } else {
            System.out.println("Phần tử '" + keyToCheck + "' không tồn tại trong HashMap.");
        }
    }

    // Phương thức kiểm tra sự tồn tại của phần tử trong HashMap
    public static boolean kiemTraTontaiTrongHashMap(HashMap<String, Integer> hashMap, String key) {
        return hashMap.containsKey(key);
    }
}
