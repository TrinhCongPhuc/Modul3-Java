package BT_Session15;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Bước 1: Khai báo biến và nhập dữ liệu
            System.out.print("Nhập kích thước của mảng: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.println("Nhập " + n + " số nguyên vào mảng (sắp xếp từ nhỏ đến lớn):");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Nhập giá trị cần tìm kiếm: ");
            int key = scanner.nextInt();

            // Bước 2: Sắp xếp mảng
            Arrays.sort(arr);

            // Bước 3: Thực hiện tìm kiếm nhị phân
            int result = binarySearch(arr, key);

            // Bước 4: Xử lý kết quả
            if (result != -1) {
                System.out.println("Phần tử " + key + " được tìm thấy tại vị trí " + result);
            } else {
                System.out.println("Phần tử " + key + " không được tìm thấy trong mảng.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Nhập không phải là số nguyên.");
        } finally {
            scanner.close(); // Bước 5: Đóng Scanner
        }
    }

    // Tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Không tìm thấy
    }
}
