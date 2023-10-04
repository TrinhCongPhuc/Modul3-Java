package BTJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAlphabeticalSort {
    public static void main(String[] args) {
        // Tạo một danh sách các chuỗi
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.add("fig");

        // Sắp xếp danh sách theo thứ tự bảng chữ cái ngược dùng Stream
        List<String> reversedSortedStrings = strings.stream()
                .sorted(Comparator.reverseOrder()) // Sắp xếp ngược bảng chữ cái
                .collect(Collectors.toList());

        // In ra danh sách đã sắp xếp
        System.out.println("Danh sách sau khi sắp xếp ngược bảng chữ cái:");
        reversedSortedStrings.forEach(System.out::println);
    }
}
