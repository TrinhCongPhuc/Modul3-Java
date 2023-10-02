package BT_SS11.BT6;

import java.util.Stack;

public class BracketChecker {
    public static boolean isValid(String expression) {
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char sym = expression.charAt(i);

            if (sym == '(' || sym == '[' || sym == '{') {
                bStack.push(sym);
            } else if (sym == ')' || sym == ']' || sym == '}') {
                if (bStack.isEmpty()) {
                    return false;
                }

                char left = bStack.pop();

                if ((sym == ')' && left != '(') || (sym == ']' && left != '[') || (sym == '}' && left != '{')) {
                    return false;
                }
            }
        }

        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String expression3 = "s * (s – a) * (s – b * (s – c)";
        String expression4 = "s * (s – a) * s – b) * (s – c)";
        String expression5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println(expression1 + " -> " + isValid(expression1));
        System.out.println(expression2 + " -> " + isValid(expression2));
        System.out.println(expression3 + " -> " + isValid(expression3));
        System.out.println(expression4 + " -> " + isValid(expression4));
        System.out.println(expression5 + " -> " + isValid(expression5));
    }
}