package Class;

import java.util.Scanner;
public class Class_MaxMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 2: Nhập kích thước ma trận từ người dùng
        System.out.print("Nhập số hàng của ma trận: ");
        int soHang = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int soCot = scanner.nextInt();

        // Tạo ma trận với kích thước đã nhập
        double[][] maTran = new double[soHang][soCot];

        // Bước 2: Nhập giá trị cho ma trận từ người dùng
        System.out.println("Nhập giá trị cho các phần tử trong ma trận:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Phần tử tại hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                maTran[i][j] = scanner.nextDouble();
            }
        }

        // Bước 1: Tìm phần tử lớn nhất trong ma trận
        double phanTuLonNhat = maTran[0][0]; // Giả sử phần tử đầu tiên là lớn nhất
        int hangMax = 0; // Tọa độ hàng của phần tử lớn nhất
        int cotMax = 0; // Tọa độ cột của phần tử lớn nhất

        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (maTran[i][j] > phanTuLonNhat) {
                    phanTuLonNhat = maTran[i][j];
                    hangMax = i;
                    cotMax = j;
                }
            }
        }

        // Hiển thị kết quả tìm thấy
        System.out.println("Phần tử lớn nhất trong ma trận là " + phanTuLonNhat);
        System.out.println("Tọa độ của phần tử lớn nhất: Hàng " + (hangMax + 1) + ", Cột " + (cotMax + 1));
    }
}
