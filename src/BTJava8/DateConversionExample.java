package BTJava8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConversionExample {

    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập chuỗi ngày tháng năm
        System.out.print("Nhập ngày tháng năm (theo định dạng dd/MM/yyyy): ");
        String inputDateStr = scanner.nextLine();

        // Sử dụng DateTimeFormatter để định dạng đầu vào theo định dạng dd/MM/yyyy
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Chuyển đổi chuỗi ngày tháng thành đối tượng LocalDate
            LocalDate localDate = LocalDate.parse(inputDateStr, dateFormatter);

            // In ra đối tượng LocalDate đã chuyển đổi
            System.out.println("Đối tượng LocalDate đã chuyển đổi: " + localDate);
        } catch (Exception e) {
            System.out.println("Định dạng ngày tháng không hợp lệ. Hãy nhập lại theo định dạng dd/MM/yyyy.");
        } finally {
            // Đóng đối tượng Scanner
            scanner.close();
        }
    }
}




