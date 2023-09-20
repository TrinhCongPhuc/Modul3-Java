package ClassSV;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassStudent[] studentList = new ClassStudent[100]; // Khởi tạo danh sách học sinh

        int studentCount = 0; // Số lượng học sinh hiện tại

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Hiển thị danh sách tất cả học sinh
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println("Học sinh thứ " + (i + 1) + ":");
                        studentList[i].inputData();
                        studentList[i].displayData();

                    }
                    break;
                case 2:
                    // Thêm mới học sinh
                    if (studentCount < studentList.length) {
                        studentList[studentCount] = new ClassStudent();
                        studentList[studentCount].inputData();
                        studentCount++;
                        System.out.println("Thêm học sinh thành công!");
                    } else {
                        System.out.println("Danh sách học sinh đã đầy. Không thể thêm nữa.");
                    }
                    break;
                case 3:
                    // Sửa thông tin học sinh dựa vào mã học sinh
                    System.out.print("Nhập mã học sinh cần sửa: ");
                    String codeToEdit = scanner.next();
                    for (int i = 0; i < studentCount; i++) {

                        if (studentList[i].getStudentCode().equals(codeToEdit)) {
                            studentList[i].inputData();
                            System.out.println("Sửa thông tin học sinh thành công!");
                            break;
                        }
                    }
                    break;
                case 4:
                    // Xoá học sinh
                    System.out.print("Nhập mã học sinh cần xoá: ");
                    String codeToDelete = scanner.next();
                    for (int i = 0; i < studentCount; i++) {
                        if (studentList[i].getStudentCode().equals(codeToDelete)) {
                            // Dịch chuyển các phần tử phía sau lên để xoá
                            for (int j = i; j < studentCount - 1; j++) {
                                studentList[j] = studentList[j + 1];
                            }
                            studentCount--;
                            System.out.println("Xoá học sinh thành công!");
                            break;
                        }
                    }
                    break;
                case 5:
                    // Thoát chương trình
                    System.out.println("Chương trình kết thúc.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}






