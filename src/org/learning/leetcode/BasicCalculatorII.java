package org.learning.leetcode;

public class BasicCalculatorII {
    public static void main(String[] args) {
        String s = " 3 + 2 * 2";
        System.out.println("Answer is :: " + calculate(s));
    }

    public static int calculate(String s) {
        String str = s.replace(" ", "");
        char[] sArr = str.toCharArray();
        int value = Character.getNumericValue(sArr[0]);
        for (int i = 1; i < sArr.length; i += 2) {
            if (sArr[i] == '+') {
                value += Character.getNumericValue(sArr[i + 1]);
            } else if (sArr[i] == '-') {
                value -= Character.getNumericValue(sArr[i + 1]);
            } else if (sArr[i] == '*') {
                value *= Character.getNumericValue(sArr[i + 1]);
            } else if (sArr[i] == '/') {
                value /= Character.getNumericValue(sArr[i + 1]);
            }
        }
        return value;
    }
}
