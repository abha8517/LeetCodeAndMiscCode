package org.learning.leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int wealth = maximumWealth(accounts);
        System.out.println(wealth);
    }

    private static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] arr:accounts) {
            int sum = 0;
            for (int val:arr) {
                sum+=val;
            }
            if (sum>maxWealth) maxWealth = sum;
        }
        return maxWealth;
    }
}
