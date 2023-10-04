package BTJava8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DistanceBetweenDates {
    public static void main(String[] args) {
        // Tạo hai đối tượng LocalDate đại diện cho hai ngày
        LocalDate date1 = LocalDate.of(2023, 9, 1); // Ngày tháng đầu tiên
        LocalDate date2 = LocalDate.of(2023, 10, 5); // Ngày tháng thứ hai

        // Tính khoảng cách giữa hai ngày bằng cách sử dụng ChronoUnit.DAYS
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        // In ra số ngày và đối tượng ngày tháng đó
        System.out.println("Số ngày giữa hai ngày là: " + daysBetween);
        System.out.println("Ngày tháng đầu tiên: " + date1);
        System.out.println("Ngày tháng thứ hai: " + date2);
    }
}
