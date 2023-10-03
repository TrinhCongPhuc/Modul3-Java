package BT_SS12;

import java.util.HashMap;

public class CopyHashMap {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap gốc và thêm dữ liệu
        HashMap<Integer, String> hashMapGoc = new HashMap<>();
        hashMapGoc.put(1, "Một");
        hashMapGoc.put(2, "Hai");
        hashMapGoc.put(3, "Ba");

        // Bước 2: Khai báo một HashMap mới và sao chép tất cả các phần tử từ HashMap gốc vào HashMap mới
        HashMap<Integer, String> hashMapMoi = new HashMap<>();
        hashMapMoi.putAll(hashMapGoc);

        // Bước 3: Kiểm tra xem HashMap mới đã sao chép chính xác tất cả các phần tử từ HashMap gốc hay chưa
        System.out.println("HashMap gốc: " + hashMapGoc);
        System.out.println("HashMap mới: " + hashMapMoi);
    }
}

//HashMap gốc: {1=Một, 2=Hai, 3=Ba}
//HashMap mới: {1=Một, 2=Hai, 3=Ba}
