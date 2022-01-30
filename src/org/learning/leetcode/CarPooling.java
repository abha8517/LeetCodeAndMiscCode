package org.learning.leetcode;

public class CarPooling {
    public static void main(String[] args) {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        System.out.println(carPooling(trips, capacity));
    }

    private static boolean carPooling(int[][] trips, int capacity) {
        int[] route = new int[1001];
        for (int[] trip:trips) {
            route[trip[1]]+=trip[0];
            route[trip[2]]-=trip[0];
        }
        int sum = 0;
        for (int km:route) {
            sum+=km;
            if (sum>capacity) return false;
        }
        return true;
    }
}
