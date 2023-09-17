package Class;
import java.util.Scanner;
import java.util.Arrays;
public class Class_Max2Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] mangSoNguyen = new int[size]; // Tạo một mảng số nguyên

        // Nhập giá trị cho mảng từ người dùng
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            mangSoNguyen[i] = scanner.nextInt();
        }

        System.out.println("Mảng vừa nhập là: " + Arrays.toString(mangSoNguyen));

        int giaTriLonNhat = mangSoNguyen[0];
        int giaTriLonThuHai = mangSoNguyen[1];  // hoặc Integer.MIN_VALUE;

        // Tìm giá trị lớn thứ nhất và lớn thứ hai trong mảng
        for (int i = 1; i < mangSoNguyen.length; i++) {
            if (mangSoNguyen[i] > giaTriLonNhat) {
                giaTriLonThuHai = giaTriLonNhat;
                giaTriLonNhat = mangSoNguyen[i];
            } else if (mangSoNguyen[i] > giaTriLonThuHai && mangSoNguyen[i] != giaTriLonNhat) {
                giaTriLonThuHai = mangSoNguyen[i];
            }
        }

        System.out.println("Phần tử lớn thứ hai trong mảng là: " + giaTriLonThuHai);
    }
}
