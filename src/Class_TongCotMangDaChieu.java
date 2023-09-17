package Class;
import java.util.Scanner;
import java.util.Arrays;

public class Class_TongCotMangDaChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int soHang = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int soCot = scanner.nextInt();

        int[][] maTran = new int[soHang][soCot];

        System.out.println("Nhập giá trị cho các phần tử trong ma trận:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Phần tử tại hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                maTran[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Nhập số cột cần tính tổng: ");
        int cotCanTinhTong = scanner.nextInt();
        int tongCot = 0;
        for (int i = 0; i < soHang; i++) {
            tongCot += maTran[i][cotCanTinhTong - 1];
        }
        System.out.println("Tổng các số ở cột " + cotCanTinhTong + " là: " + tongCot);
    }
}
