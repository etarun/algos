package numbers;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {

        String[] tokens = {"4", "13", "5", "/", "+"};

        List<String> operators = new ArrayList<>();
        operators.add("*");
        operators.add("+");
        operators.add("-");
        operators.add("/");
        Stack<String> stack = new Stack<>();
        try {
            for (int i = 0; i < tokens.length; i++) {
                stack.push(tokens[i]);
                if (operators.contains(stack.peek())) {
                    String opr = stack.pop();
                    int y = Integer.valueOf(stack.pop());
                    int x = Integer.valueOf(stack.pop());
                    if (opr.equals("*")) {
                        stack.push(String.valueOf(x * y));
                    } else if (opr.equals("+")) {
                        stack.push(String.valueOf(x + y));
                    } else if (opr.equals("/")) {
                        stack.push(String.valueOf(x / y));
                    } else if (opr.equals("-")) {
                        stack.push(String.valueOf(x - y));
                    }
                }
            }
        } catch (Exception e) {
            return;
        }
        int res = Integer.valueOf(stack.pop());
        System.out.println(res);
    }
}
