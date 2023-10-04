package BTJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringFilterExample {
    public static void main(String[] args) {
        // Sử dụng Scanner để nhập danh sách chuỗi từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập danh sách chuỗi (cách nhau bởi dấu phẩy):");
        String input = scanner.nextLine();

        // Chuyển chuỗi nhập vào thành một danh sách các từ, tách chúng bằng dấu phẩy
        List<String> inputList = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        // Sử dụng Stream API để lọc danh sách chuỗi
        List<String> filteredList = inputList.stream()
                .filter(str -> str.length() >= 5) // Lọc các từ có độ dài lớn hơn hoặc bằng 5
                .collect(Collectors.toList());

        // In ra danh sách sau khi lọc
        System.out.println("Danh sách sau khi lọc:");
        filteredList.forEach(System.out::println);
    }
}






