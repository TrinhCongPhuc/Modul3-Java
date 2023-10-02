package BT_SS11.BT5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        for (char c : str.toCharArray()) {
            queue.add(c);
        }

        StringBuilder reverseStr = new StringBuilder();
        while (!queue.isEmpty()) {
            reverseStr.insert(0, queue.poll());
        }

        String reversed = reverseStr.toString();
        return str.equals(reversed);
    }
}

