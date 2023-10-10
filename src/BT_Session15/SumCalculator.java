package BT_Session15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                throw new InputMismatchException("Số lượng phần tử phải là một số nguyên dương.");
            }

            int[] arr = new int[n];

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            if (n == 0) {
                throw new InputMismatchException("Mảng không có phần tử.");
            }

            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Số lớn nhất trong mảng là: " + max);
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
