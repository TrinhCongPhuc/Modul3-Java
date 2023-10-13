package BT_Session16.BT4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SortWordsFromFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\user\\Desktop\\JAVA Modul 3\\Session16\\src\\BT_Session16\\BT4\\baitap4.txt"; // Thay thế bằng tên tệp văn bản thực tế

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder content = new StringBuilder();

            // Đọc nội dung từ tệp và lưu vào StringBuilder
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }

            br.close();

            // Tách nội dung thành các từ và lưu vào mảng
            String[] words = content.toString().split("\\s+");

            // Sắp xếp các từ theo thứ tự bảng chữ cái
            Arrays.sort(words);

            // In ra kết quả
            System.out.println("Các từ sau khi sắp xếp theo thứ tự bảng chữ cái:");
            for (String word : words) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp " + fileName + ": " + e.getMessage());
        }
    }
}
