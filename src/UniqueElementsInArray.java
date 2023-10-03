package BT_SS12;

import java.util.*;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        // Khởi tạo HashMap để lưu trữ các phần tử duy nhất và số lần xuất hiện
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Bước 2: Duyệt từng phần tử trong mảng
        for (int element : arr) {
            // Kiểm tra xem phần tử đã có trong HashMap hay chưa
            if (elementCountMap.containsKey(element)) {
                // Nếu đã có, tăng giá trị tương ứng lên 1
                int count = elementCountMap.get(element);
                elementCountMap.put(element, count + 1);
            } else {
                // Nếu chưa có, thêm phần tử vào HashMap với giá trị ban đầu là 1
                elementCountMap.put(element, 1);
            }
        }

        // Bước 3: Duyệt qua các phần tử trong HashMap và lưu trữ các phần tử có giá trị bằng 1 vào một mảng mới
        List<Integer> uniqueElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueElements.add(entry.getKey());
            }
        }

        // Bước 4: In ra các phần tử duy nhất
        System.out.println("Các phần tử duy nhất trong mảng:");
        for (int uniqueElement : uniqueElements) {
            System.out.println(uniqueElement);
        }
    }
}
