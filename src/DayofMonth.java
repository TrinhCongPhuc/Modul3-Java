import java.util.Scanner;

public class DayofMonth {

    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để nhận dữ liệu đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // In ra thông báo yêu cầu người dùng nhập tháng
        System.out.println("Bạn muốn đếm ngày cho tháng nào?");

        // Đọc và lưu giá trị tháng mà người dùng nhập vào
        int thang = scanner.nextInt();

        // Sử dụng câu lệnh switch để xử lý dựa trên giá trị của biến "thang"
        switch (thang) {
            case 2:
                // Nếu tháng là 2, in ra thông báo về số ngày trong tháng 2
                System.out.println("Tháng " + thang + " có 28 hoặc 29 ngày!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                // Nếu tháng là 1, 3, 5, 7, 8, 10 hoặc 12, in ra thông báo về số ngày trong tháng đó
                System.out.println("Tháng " + thang + " có 31 ngày!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                // Nếu tháng là 4, 6, 9 hoặc 11, in ra thông báo về số ngày trong tháng đó
                System.out.println("Tháng " + thang + " có 30 ngày!");
                break;
            default:
                // Trường hợp mặc định khi tháng không nằm trong các trường hợp trên
                System.out.println("Tháng này không tồn tại!");
        }
    }
}