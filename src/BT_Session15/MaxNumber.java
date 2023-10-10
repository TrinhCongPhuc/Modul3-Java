package BT_Session15;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo biến và nhập dữ liệu
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Mảng rỗng. Không có phần tử để tìm.");
        } else {
            int[] arr = new int[n];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            try {
                // Bước 2: Kiểm tra trường hợp mảng rỗng
                if (n == 0) {
                    throw new IllegalArgumentException("Mảng rỗng. Không có phần tử để tìm.");
                }

                // Bước 3: Tìm số lớn nhất
                int max = arr[0];
                for (int i = 1; i < n; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                // Bước 4: Hiển thị kết quả
                System.out.println("Số lớn nhất trong mảng là: " + max);
            } catch (IllegalArgumentException e) {
                // Bắt ngoại lệ và hiển thị thông báo lỗi
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
