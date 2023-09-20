import java.util.Scanner;

public class ClassHinhTron {
    private double banKinh;
    private String mauSac;

    public ClassHinhTron() {
        // Constructor mặc định
    }

    public ClassHinhTron(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn:");
        this.banKinh = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng newline
        System.out.println("Nhập màu sắc hình tròn:");
        this.mauSac = scanner.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Thông tin hình tròn:");
        System.out.println("Bán kính: " + this.banKinh);
        System.out.println("Màu sắc: " + this.mauSac);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());
    }

    public static void main(String[] args) {
        ClassHinhTron hinhTron = new ClassHinhTron();
        hinhTron.nhapThongTin();
        hinhTron.hienThiThongTin();
    }
}
