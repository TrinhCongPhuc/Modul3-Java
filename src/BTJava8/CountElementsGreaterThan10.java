package BTJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountElementsGreaterThan10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách các số nguyên từ người dùng
        System.out.print("Nhập danh sách các số nguyên (cách nhau bằng dấu cách): ");
        String input = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();

        // Tách và chuyển đổi chuỗi nhập vào thành danh sách số nguyên
        String[] numberTokens = input.split("\\s+");
        for (String token : numberTokens) {
            try {
                int num = Integer.parseInt(token);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Không phải là số nguyên: " + token);
            }
        }

        // Sử dụng Stream để đếm số lượng phần tử lớn hơn 10
        long count = numbers.stream()
                .filter(num -> num > 10)
                .count();

        // In ra kết quả
        System.out.println("Số lượng phần tử lớn hơn 10: " + count);
    }
}
