package BTJava8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeExample {
    public static void main(String[] args) {
        // Lấy thời gian hiện tại
        LocalDateTime now = LocalDateTime.now();

        // Định dạng ngày và giờ bằng DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Sử dụng formatter để định dạng thời gian hiện tại thành chuỗi
        String formattedDateTime = now.format(formatter);

        // In ra ngày và giờ hiện tại đã định dạng
        System.out.println("Ngày và giờ hiện tại: " + formattedDateTime);
    }
}
