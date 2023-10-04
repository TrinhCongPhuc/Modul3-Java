package BTJava8;

import java.time.LocalDate;
import java.time.Period;

public class TinhTuoi {
    public static void main(String[] args) {
        // Năm sinh của người
        int namSinh = 1990;

        // Lấy ngày hiện tại
        LocalDate ngayHienTai = LocalDate.now();

        // Tạo đối tượng LocalDate từ năm sinh
        LocalDate ngaySinh = LocalDate.of(namSinh, 1, 1);

        // Tính tuổi bằng cách sử dụng lớp Period
        Period tuoi = Period.between(ngaySinh, ngayHienTai);

        // In tuổi
        System.out.println("Tuổi của người này là: " + tuoi.getYears() + " năm " + tuoi.getMonths() + " tháng " + tuoi.getDays() + " ngày");
    }
}
