import java.util.Scanner;

public class TimMaxArr {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // Nhập và kiểm tra kích thước mảng
        do {
            System.out.print("Nhập kích thước mảng (tối đa 20): ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước không được vượt quá 20");
        } while (size > 20);

        // Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập giá trị tài sản của tỷ phú " + (i + 1) + " (đơn vị tỉ đô): ");
            array[i] = scanner.nextInt();
            i++;
        }

        // In ra danh sách tài sản đã nhập
        System.out.print("Danh sách tài sản: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }

        System.out.println("\nGiá trị tài sản lớn nhất trong danh sách là " + max + " tỉ đô, tại vị trí " + index);
    }
}