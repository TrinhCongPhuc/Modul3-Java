import java.util.Scanner;
public class ClassEmployee {
    public static class Employee {
        private String employeeId;
        private String employeeName;
        private int age;
        private String gen;
        private double rate;
        private double salary;

        // Constructor mặc định
        public Employee() {
            this.employeeId = "";
            this.employeeName = "";
            this.age = 0;
            this.gen = "";
            this.rate = 0.0;
            this.salary = 0.0;
        }

        // Constructor với tham số
        public Employee(String employeeId, String employeeName, int age, String gen, double rate) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.age = age;
            this.gen = gen;
            this.rate = rate;
            this.salary = 0.0;
        }

        // Phương thức nhập thông tin nhân viên từ người dùng
        public void inputData() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập mã nhân viên: ");
            this.employeeId = scanner.nextLine();

            System.out.println("Nhập tên nhân viên: ");
            this.employeeName = scanner.nextLine();

            System.out.println("Nhập tuổi: ");
            this.age = scanner.nextInt();

            scanner.nextLine(); // Đọc bỏ dòng trống

            System.out.println("Nhập giới tính: ");
            this.gen = scanner.nextLine();

            System.out.println("Nhập hệ số lương: ");
            this.rate = scanner.nextDouble();
        }

        // Phương thức tính lương
        public void calSalary() {
            this.salary = this.rate * 1300000;
        }

        // Phương thức hiển thị thông tin nhân viên
        public void displayData() {
            System.out.println("Mã nhân viên: " + this.employeeId);
            System.out.println("Tên nhân viên: " + this.employeeName);
            System.out.println("Tuổi: " + this.age);
            System.out.println("Giới tính: " + this.gen);
            System.out.println("Hệ số lương: " + this.rate);
            System.out.println("Lương: " + this.salary);
        }

        public static void main(String[] args) {
            Employee employee = new Employee();
            employee.inputData();
            employee.calSalary();
            employee.displayData();
        }
    }
}
