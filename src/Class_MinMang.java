package Class;
import java.util.Scanner;
public class Class_MinMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int kichThuoc = scanner.nextInt();
        int[] mang = new int[kichThuoc];
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < kichThuoc; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        int giaTriNhoNhat = mang[0];
        for (int i = 1; i < kichThuoc; i++) {
            if (mang[i] < giaTriNhoNhat) {
                giaTriNhoNhat = mang[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + giaTriNhoNhat);
    }
}
