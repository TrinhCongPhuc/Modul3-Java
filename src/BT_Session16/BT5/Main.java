package BT_Session16.BT5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\user\\Desktop\\JAVA Modul 3\\Session16\\src\\BT_Session16\\BT5\\baitap5.txt"; // Thay đổi tên tệp cần đọc tại đây
        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > maxLength) {
                        maxLength = word.length();
                        longestWords.clear();
                        longestWords.add(word);
                    } else if (word.length() == maxLength) {
                        longestWords.add(word);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (longestWords.isEmpty()) {
            System.out.println("Không có từ nào trong file.");
        } else {
            System.out.println("Các từ có độ dài lớn nhất trong file:");
            for (String word : longestWords) {
                System.out.println(word + " (Độ dài: " + maxLength + ")");
            }
        }
    }
}
