package Class;
import java.util.Scanner;
import java.util.Arrays;
public class Class_DuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận vuông: ");
        int kichThuoc = scanner.nextInt();
        int[][] maTran = new int[kichThuoc][kichThuoc];
        System.out.println("Nhập giá trị cho các phần tử trong mảng: ");
        for (int i = 0; i < kichThuoc; i++) {
            for (int j = 0; j < kichThuoc; j++) {
                System.out.printf("maTran[%d][%d]: ", i, j);
                maTran[i][j] = scanner.nextInt();
            }
        }

        int tongDuongCheo = 0;
        for (int i = 0; i < kichThuoc; i++) {
            tongDuongCheo += maTran[i][i];
        }

        System.out.println("Tổng các số ở đường chéo chính là: " + tongDuongCheo);
    }
}
