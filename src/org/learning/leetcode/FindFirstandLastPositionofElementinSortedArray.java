package org.learning.leetcode;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] output = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        bsearch(nums, target, 0, nums.length - 1, output);
        if (output[0] == Integer.MAX_VALUE && output[1] == Integer.MIN_VALUE) {
            output[0] = -1;
            output[1] = -1;
        }
        return output;
    }

    private static void bsearch(int[] nums, int target, int start, int end, int[] output) {
        if (start > end) return;
        int mid = start + ((end - start) / 2);
        if (nums[mid] == target) {
            if (output[0] > mid) {
                bsearch(nums, target, start, mid - 1, output);
            }
            if (output[1] < mid) {
                bsearch(nums, target, mid + 1, end, output);
            }
            output[0] = Math.min(output[0], mid);
            output[1] = Math.max(output[1], mid);
        }
        if (nums[mid] > target) {
            bsearch(nums, target, start, mid - 1, output);
        } else {
            bsearch(nums, target, mid + 1, end, output);
        }
    }
}
