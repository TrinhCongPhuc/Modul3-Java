package Class;
import java.util.Arrays;
import java.util.Scanner;

public class Class_Gop2Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng 1
        System.out.println("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        // Nhập kích thước mảng 2
        System.out.println("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("------------------");
        System.out.println("Nhập mảng 1");

        // Nhập các phần tử của mảng 1
        for (int i = 0; i < size1; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + " :");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Nhập mảng 2");

        // Nhập các phần tử của mảng 2
        for (int i = 0; i < size2; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + " :");
            arr2[i] = scanner.nextInt();
        }

        // Tạo mảng mới có kích thước là tổng kích thước của hai mảng
        int size3 = size1 + size2;
        int[] arr3 = new int[size3];

        // Gộp mảng 1 và mảng 2 vào mảng 3
        System.arraycopy(arr1, 0, arr3, 0, size1);
        System.arraycopy(arr2, 0, arr3, size1, size2);

        System.out.println("Mảng sau khi gộp là: ");
        System.out.println(Arrays.toString(arr3));
    }
}
