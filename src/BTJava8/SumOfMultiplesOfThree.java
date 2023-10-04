package BTJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfMultiplesOfThree {
    public static void main(String[] args) {
        // Tạo một danh sách để lưu trữ các số người dùng nhập vào
        List<Integer> numbers = new ArrayList<>();

        // Sử dụng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các số:");

        // Đọc và thêm các số vào danh sách
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        // Sử dụng Stream API và Lambda Expression để tính tổng các số chia hết cho 3
        int sum = numbers.stream()
                .filter(num -> num % 3 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        // In ra tổng các số chia hết cho 3
        System.out.println("Tổng các số chia hết cho 3: " + sum);

        // Đóng Scanner
        scanner.close();
    }
}
