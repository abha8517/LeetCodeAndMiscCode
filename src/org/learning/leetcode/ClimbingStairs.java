package org.learning.leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        int secondLast = 1, last = 1, sum = 0;
        if (n<2) return n;
        for (int i = 2; i <= n; i++) {
            sum = secondLast + last;
            secondLast = last;
            last = sum;
        }
        return sum;
    }
}
