package BTJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Nhập danh sách số nguyên từ người dùng
        System.out.print("Nhập số nguyên (nhập -1 để kết thúc): ");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            numbers.add(input);
            System.out.print("Nhập số nguyên (nhập -1 để kết thúc): ");
        }

        // Sử dụng Stream API để tính tổng các số chẵn
        int sumOfEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Tổng của các số chẵn là: " + sumOfEvenNumbers);

        scanner.close();
    }
}
