package BT_Session15;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        scanner.close();

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            try {
                int num = Integer.parseInt(String.valueOf(input.charAt(i)));
                integerList.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: '" + input.charAt(i) + "' không phải số nguyên.");
                integerList.add(0);
            }
        }

        System.out.print("Danh sách số nguyên: ");
        for (Integer num : integerList) {
            System.out.print(num + " ");
        }
    }
}

