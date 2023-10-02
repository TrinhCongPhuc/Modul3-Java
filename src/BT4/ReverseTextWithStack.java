package BT_SS11.BT4;

import java.util.Scanner;
import java.util.Stack;

public class ReverseTextWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng từ: ");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số lượng từ

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Nhập từ số " + (i + 1) + ": ");
            String word = scanner.nextLine();
            stack.push(word);
        }

        System.out.print("Văn bản đảo ngược là: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        scanner.close();
    }
}
