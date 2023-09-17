package Class;
import java.util.Scanner;
public class Class_SoLanKyTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String chuoiNhap = scanner.nextLine();

        System.out.println("Nhập ký tự cần tìm: ");
        char kyTuCanTim = scanner.next().charAt(0);

        int dem = 0;
        for (int i = 0; i < chuoiNhap.length(); i++) {
            if (chuoiNhap.charAt(i) == kyTuCanTim) {
                dem++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự cần tìm trong chuỗi là: " + dem);
    }
}
