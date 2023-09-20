package ClassSV;

import java.util.Scanner;

public class ClassStudent {
    private String studentCode;

    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    // Constructors
    public String getStudentCode() {
        return studentCode;
    }
    public ClassStudent() {
        // Constructor mặc định không có tham số
    }

    public ClassStudent(String studentCode, String name, int age, String gender, String address, String phoneNumber) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Input thông tin học sinh từ người dùng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã HS: ");
        this.studentCode = scanner.nextLine();
        System.out.print("Nhập tên HS: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng thừa để loại bỏ ký tự new line
        System.out.print("Nhập giới tính: ");
        this.gender = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
    }

    // Hiển thị thông tin học sinh
    public void displayData() {
        System.out.println("Mã HS: " + studentCode);
        System.out.println("Tên HS: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
    }
}