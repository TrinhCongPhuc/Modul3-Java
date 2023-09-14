import java.util.Scanner;

public class DemSvPass{
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập kích thước mảng và kiểm tra
        do {
            System.out.print("Nhập kích thước mảng: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Kích thước mảng không được vượt quá 30");
        } while (size > 30);

        // Bước 2: Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm của sinh viên " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        // Bước 3: Sử dụng vòng lặp for để in ra danh sách điểm và đếm số sinh viên thi đỗ
        int count = 0;
        System.out.print("Danh sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println("\nSố lượng sinh viên thi đỗ là " + count);
    }
}