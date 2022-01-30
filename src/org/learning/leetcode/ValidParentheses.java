package org.learning.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        int pointer = 0;
        Stack<Character> stack = new Stack<>();
        while (pointer < s.length()) {
            if (s.charAt(pointer) == '(' || s.charAt(pointer) == '{' || s.charAt(pointer) == '[') {
                stack.push(s.charAt(pointer));
            } else if (s.charAt(pointer) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else return false;
            } else if (s.charAt(pointer) == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else return false;
            } else if (s.charAt(pointer) == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else return false;
            }
            pointer++;
        }
        if (stack.isEmpty()) {
            return true;
        } else return false;
    }
}
