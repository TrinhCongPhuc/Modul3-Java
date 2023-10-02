package BT_SS11.BT2;

import java.util.Stack;

public class CheckParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "([)]";

        if (isValid(input1)) {
            System.out.println(input1 + " là chuỗi đúng.");
        } else {
            System.out.println(input1 + " không là chuỗi đúng.");
        }

        if (isValid(input2)) {
            System.out.println(input2 + " là chuỗi đúng.");
        } else {
            System.out.println(input2 + " không là chuỗi đúng.");
        }
    }
}
