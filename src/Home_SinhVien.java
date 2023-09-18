import java.util.Scanner;

// Định nghĩa lớp Student
class Student {
    // Khai báo các thuộc tính của lớp Student
    private String maHocSinh;
    private String tenHocSinh;
    private String gioiTinh;
    private String tenLopHoc;
    private int tuoi;
    private String diaChi;

    // Phương thức khởi tạo không tham số
    public Student() {
        // Khởi tạo các thuộc tính mặc định
        maHocSinh = "";
        tenHocSinh = "";
        gioiTinh = "";
        tenLopHoc = "";
        tuoi = 0;
        diaChi = "";
    }

    // Phương thức khởi tạo với 6 tham số
    public Student(String maHocSinh, String tenHocSinh, String gioiTinh, String tenLopHoc, int tuoi, String diaChi) {
        this.maHocSinh = maHocSinh;
        this.tenHocSinh = tenHocSinh;
        this.gioiTinh = gioiTinh;
        this.tenLopHoc = tenLopHoc;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    // Phương thức hiển thị thông tin của học sinh
    public void display() {
        System.out.println("Thông tin học sinh:");
        System.out.println("Mã học sinh: " + maHocSinh);
        System.out.println("Tên học sinh: " + tenHocSinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Tên lớp học: " + tenLopHoc);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Địa chỉ: " + diaChi);
    }
}

public class Home_SinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin học sinh từ người dùng
        System.out.print("Nhập mã học sinh: ");
        String maHocSinh = scanner.nextLine();
        System.out.print("Nhập tên học sinh: ");
        String tenHocSinh = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhập tên lớp học: ");
        String tenLopHoc = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số tuổi
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        // Tạo đối tượng Student từ thông tin đã nhập
        Student hocSinh = new Student(maHocSinh, tenHocSinh, gioiTinh, tenLopHoc, tuoi, diaChi);

        // Hiển thị thông tin học sinh
        hocSinh.display();

        // Đóng Scanner
        scanner.close();
    }
}
