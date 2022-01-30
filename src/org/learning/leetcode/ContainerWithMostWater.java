package org.learning.leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while (start != end) {
            int area = (end - start) * Math.min(height[start], height[end]);
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[start]>height[end]) {
                end--;
            } else start++;
        }
        return maxArea;
    }
}
