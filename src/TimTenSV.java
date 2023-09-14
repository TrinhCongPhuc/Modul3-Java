import java.util.Scanner;

public class TimTenSV {
    public static void main(String[] args) {
        // Khai báo một mảng chứa danh sách tên sinh viên
        String[] students = {"SinhVien1", "SinhVien2", "SinhVien3", "SinhVien4"};

        // Khai báo biến để lưu tên tìm kiếm và đọc giá trị từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String input_name = scanner.nextLine();

        // Duyệt mảng sinh viên để tìm vị trí của tên đã nhập
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của sinh viên " + input_name + " trong danh sách là: " + i);
                isExist = true;
                break;
            }
        }

        // Kiểm tra nếu không tìm thấy tên trong danh sách
        if (!isExist) {
            System.out.println("Không tìm thấy " + input_name + " trong danh sách.");
        }
    }
}