import java.util.Scanner;

public class LinearSearchAndMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập mảng số nguyên
        System.out.print("Nhập độ dài của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Bước 2: Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        // Bước 3: Tìm kiếm tuyến tính và in ra vị trí hoặc thông báo không tìm thấy
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + i);
                found = true;
                break; // Dừng tìm kiếm khi đã tìm thấy
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }

        // Bước 4: Tìm số lớn nhất trong mảng và in ra
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
