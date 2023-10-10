package BT_Session15;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Đổi kích thước mảng tùy ý

        System.out.println("Nhập " + numbers.length + " số nguyên:");

        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Phần tử không phải là số nguyên. Bỏ qua phần tử này.");
                scanner.next(); // Đọc và loại bỏ giá trị không hợp lệ
                i--; // Lặp lại việc nhập cho phần tử hiện tại
            }
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Tổng của các số nguyên trong mảng là: " + sum);

        scanner.close();
    }
}
