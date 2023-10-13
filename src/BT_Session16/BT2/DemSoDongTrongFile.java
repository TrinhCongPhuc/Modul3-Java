package BT_Session16.BT2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemSoDongTrongFile {
    public static void main(String[] args) {
        String tenTep = "C:\\Users\\user\\Desktop\\JAVA Modul 3\\Session16\\src\\BT_Session16\\BT2\\demDong.txt"; // Thay thế bằng đường dẫn tới tệp văn bản cụ thể bạn muốn đọc

        try {
            FileReader fileReader = new FileReader(tenTep);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int soDong = 0;
            String dong;

            while ((dong = bufferedReader.readLine()) != null) {
                soDong++;
                // In nội dung từng dòng nếu cần
                System.out.println(dong);
            }

            System.out.println("Số dòng trong tệp: " + soDong);

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Xảy ra lỗi khi đọc tệp: " + e.getMessage());
        }
    }
}
