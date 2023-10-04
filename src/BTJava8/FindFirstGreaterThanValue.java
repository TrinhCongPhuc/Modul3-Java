package BTJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;

public class FindFirstGreaterThanValue {
    public static void main(String[] args) {
        // Tạo danh sách các số nguyên ví dụ
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);

        // Sử dụng Scanner để nhập giá trị cụ thể từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cụ thể: ");
        int targetValue = scanner.nextInt();

        // Sử dụng Stream API để tìm số nguyên đầu tiên lớn hơn giá trị nhập vào
        Optional<Integer> result = numbers.stream()
                .filter(num -> num > targetValue)
                .findFirst();

        // Kiểm tra xem có số nào thỏa mãn hay không
        if (result.isPresent()) {
            System.out.println("Số nguyên đầu tiên lớn hơn " + targetValue + " là: " + result.get());
        } else {
            System.out.println("Không có số nguyên nào lớn hơn " + targetValue);
        }

        // Đóng Scanner
        scanner.close();
    }
}




