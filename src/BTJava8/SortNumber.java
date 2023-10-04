package BTJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortNumber {
    public static void main(String[] args) {
        // Tạo một danh sách để lưu trữ các số nguyên
        List<Integer> numbers = new ArrayList<>();

        // Sử dụng Scanner để nhập các số từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các số nguyên (nhập một số âm để kết thúc):");

        // Đọc các số nguyên từ người dùng và thêm vào danh sách
        while (true) {
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }

        // Sử dụng Stream API để sắp xếp danh sách số nguyên theo thứ tự giảm dần
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder()) // Sắp xếp giảm dần
                .limit(3) // Giới hạn chỉ lấy 3 phần tử đầu tiên
                .collect(Collectors.toList());

        // In ra kết quả
        System.out.println("Ba số lớn nhất là:");
        sortedNumbers.forEach(System.out::println);
    }
}
