package BT_Session16.BT3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\user\\Desktop\\JAVA Modul 3\\Session16\\src\\BT_Session16\\BT3\\baitap3.txt"; // Đặt tên tệp văn bản của bạn ở đây

        try {
            List<String> words = readFile(fileName);
            List<String> duplicateWords = findDuplicateWords(words);

            System.out.println("Các từ trùng lặp trong tệp:");
            for (String word : duplicateWords) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp văn bản: " + e.getMessage());
        }
    }

    public static List<String> readFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = br.readLine()) != null) {
            // Tách các từ trong dòng và thêm vào danh sách
            String[] lineWords = line.split("\\s+");
            for (String word : lineWords) {
                words.add(word);
            }
        }

        br.close();
        return words;
    }

    public static List<String> findDuplicateWords(List<String> words) {
        List<String> duplicateWords = new ArrayList<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            // Chuyển tất cả các từ thành chữ thường để tránh phân biệt chữ hoa/chữ thường
            word = word.toLowerCase();

            // Kiểm tra xem từ đã tồn tại trong bản đếm chưa
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Tìm các từ có số lần xuất hiện lớn hơn 1 và thêm vào danh sách
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateWords.add(entry.getKey());
            }
        }

        return duplicateWords;
    }
}
