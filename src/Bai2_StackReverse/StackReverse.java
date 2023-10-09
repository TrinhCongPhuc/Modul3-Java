package Bai2_StackReverse;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    public static Stack<String> stack = new Stack<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n****************JAVA-HACKATHON-05-STACK REVERSE***************\n" +
                    "1. Nhập câu\n" +
                    "2. Đảo ngược câu\n" +
                    "3. Thoát\n");
            System.out.println("Mời nhập lựa chọn chức năng (vui lòng chọn số nguyên dương từ 1 - 3): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        input();
                        break;
                    case 2:
                        reverse();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là một số nguyên.");
            }
        }
    }

    private static void reverse() {
        try {
            ArrayList<String> reversedList = new ArrayList<>();
            while (!stack.isEmpty()) {
                reversedList.add(stack.pop());
            }
            for (String word : reversedList) {
                System.out.print(word + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Lỗi xảy ra khi đảo ngược câu.");
        }
    }

    private static void input() {
        System.out.println("Nhập câu: ");
        String string = scanner.nextLine();
        String[] arrString = string.split(" ");
        for (int i = 0; i < arrString.length; i++) {
            stack.push(arrString[i]);
        }
    }
}
