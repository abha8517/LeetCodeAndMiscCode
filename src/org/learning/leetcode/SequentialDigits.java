package org.learning.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        int low = 100, high = 300;
        List<Integer> aList = sequentialDigits(low,high);
        System.out.println(aList);
    }

    private static List<Integer> sequentialDigits(int low, int high) {
        int ldigits = String.valueOf(low).length();
        int hdigits = String.valueOf(high).length();
        String digits = "123456789";
        List<Integer> result = new ArrayList<>();
        for (int i = ldigits; i <= hdigits; i++) {
            for (int j = 0; j < 10 - i; j++) {
                int val = Integer.parseInt(digits.substring(j, j+i));
                if (val >= low && val <= high) result.add(val);
            }
        }
        return result;
    }
}
