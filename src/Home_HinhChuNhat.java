import java.util.Scanner;

// Định nghĩa lớp Hình chữ nhật
class HinhChuNhat {
    // Khai báo các thuộc tính của hình chữ nhật
    private double width; // chiều rộng
    private double height; // chiều cao

    // Phương thức khởi tạo không tham số
    public HinhChuNhat() {
        this.width = 0.0;
        this.height = 0.0;
    }

    // Phương thức khởi tạo với 2 tham số
    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return width * height;
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        return 2 * (width + height);
    }

    // Phương thức hiển thị thông tin hình chữ nhật
    public void hienThi() {
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều cao: " + height);
    }
}

public class Home_HinhChuNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều rộng và chiều cao từ người dùng
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều cao: ");
        double height = scanner.nextDouble();

        // Tạo một đối tượng hình chữ nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat(width, height);

        // Hiển thị thông tin hình chữ nhật
        System.out.println("Hình chữ nhật của bạn:");
        hinhChuNhat.hienThi();

        // Tính và hiển thị chu vi và diện tích của hình chữ nhật
        System.out.println("Chu vi của hình chữ nhật: " + hinhChuNhat.tinhChuVi());
        System.out.println("Diện tích của hình chữ nhật: " + hinhChuNhat.tinhDienTich());
    }
}
