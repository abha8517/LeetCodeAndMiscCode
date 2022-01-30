package org.learning.leetcode;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-12, -10, -3, -4, -10, -42, -10, -5, -4};
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        int subArrayMax = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            subArrayMax += nums[i];
            if (max < subArrayMax) {
                max = subArrayMax;
            }
            if (subArrayMax < 0) {
                subArrayMax = 0;
            }
        }
        return max;
    }
}
