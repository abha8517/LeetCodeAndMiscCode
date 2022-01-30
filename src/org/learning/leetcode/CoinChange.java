package org.learning.leetcode;

public class CoinChange {
    public static void main(String[] args) {
        int amount = 3;
        int[] coins = {2};
        System.out.println("Minimum Coins required :: " + coinChange(coins, amount));
    }

    private static int coinChange(int[] coins, int amount) {
        int[] temp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            temp[i] = amount + 1;
            for (int coin:coins) {
                int sub = i - coin;
                if (sub>=0){
                    temp[i] = Math.min(temp[i],temp[sub] + 1);
                }
            }
        }
        return temp[amount]!=amount+1?temp[amount]:-1;
    }
}
