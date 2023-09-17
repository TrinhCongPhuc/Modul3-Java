package Class;
import java.util.Scanner;
import java.util.Arrays;
public class Class_BaiTongHopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến mảng 2 chiều
        int[][] maTran = null;
        int soHang = 0;
        int soCot = 0;

        while (true) {
            System.out.println("***********************MENU************************");
            System.out.println("1. Nhập giá trị các phần tử mảng 2 chiều");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
            System.out.println("4. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và tính tổng");
            System.out.println("5. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột");
            System.out.println("7. Thoát");
            System.out.println("**************************************************");
            System.out.print("Nhập lựa chọn của bạn: ");

            int luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    // Nhập giá trị các phần tử mảng 2 chiều
                    System.out.print("Nhập số hàng: ");
                    soHang = scanner.nextInt();
                    System.out.print("Nhập số cột: ");
                    soCot = scanner.nextInt();
                    maTran = new int[soHang][soCot];
                    for (int i = 0; i < soHang; i++) {
                        for (int j = 0; j < soCot; j++) {
                            System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                            maTran[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    // In giá trị các phần tử theo ma trận
                    if (maTran != null) {
                        System.out.println("Giá trị các phần tử theo ma trận:");
                        inMaTran(maTran, soHang, soCot);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 3:
                    // In giá trị các phần tử nằm trên đường biên và tính tổng
                    if (maTran != null) {
                        int tongBien = tinhTongCacPhanTuBien(maTran, soHang, soCot);
                        System.out.println("Tổng các phần tử nằm trên đường biên: " + tongBien);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 4:
                    // In giá trị các phần tử nằm trên đường chéo và tính tổng
                    if (maTran != null) {
                        int tongCheo = tinhTongCacPhanTuCheo(maTran, soHang, soCot);
                        System.out.println("Tổng các phần tử nằm trên đường chéo chính và chéo phụ: " + tongCheo);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 5:
                    // In giá trị lớn nhất và nhỏ nhất
                    if (maTran != null) {
                        int max = timGiaTriLonNhat(maTran, soHang, soCot);
                        int min = timGiaTriNhoNhat(maTran, soHang, soCot);
                        System.out.println("Giá trị lớn nhất trong mảng: " + max);
                        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 6:
                    // Sắp xếp mảng tăng dần theo cột
                    if (maTran != null) {
                        sapXepMaTranTheoCot(maTran, soHang, soCot);
                        System.out.println("Mảng sau khi sắp xếp tăng dần theo cột:");
                        inMaTran(maTran, soHang, soCot);
                    } else {
                        System.out.println("Mảng chưa được khởi tạo.");
                    }
                    break;
                case 7:
                    // Thoát
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    // In mảng 2 chiều
    private static void inMaTran(int[][] maTran, int soHang, int soCot) {
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(maTran[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Tính tổng các phần tử nằm trên đường biên của ma trận
    private static int tinhTongCacPhanTuBien(int[][] maTran, int soHang, int soCot) {
        int tong = 0;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (i == 0 || i == soHang - 1 || j == 0 || j == soCot - 1) {
                    tong += maTran[i][j];
                }
            }
        }
        return tong;
    }

    // Tính tổng các phần tử nằm trên đường chéo chính và chéo phụ của ma trận
    private static int tinhTongCacPhanTuCheo(int[][] maTran, int soHang, int soCot) {
        int tong = 0;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (i == j || i + j == soHang - 1) {
                    tong += maTran[i][j];
                }
            }
        }
        return tong;
    }

    // Tìm giá trị lớn nhất trong mảng 2 chiều
    private static int timGiaTriLonNhat(int[][] maTran, int soHang, int soCot) {
        int max = maTran[0][0];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                }
            }
        }
        return max;
    }

    // Tìm giá trị nhỏ nhất trong mảng 2 chiều
    private static int timGiaTriNhoNhat(int[][] maTran, int soHang, int soCot) {
        int min = maTran[0][0];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (maTran[i][j] < min) {
                    min = maTran[i][j];
                }
            }
        }
        return min;
    }

    // Sắp xếp mảng theo cột
    private static void sapXepMaTranTheoCot(int[][] maTran, int soHang, int soCot) {
        for (int j = 0; j < soCot; j++) {
            for (int i = 0; i < soHang - 1; i++) {
                for (int k = i + 1; k < soHang; k++) {
                    if (maTran[i][j] > maTran[k][j]) {
                        int temp = maTran[i][j];
                        maTran[i][j] = maTran[k][j];
                        maTran[k][j] = temp;
                    }
                }
            }
        }
    }
}
