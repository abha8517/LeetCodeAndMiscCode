package org.learning.leetcode;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 1};
        int target = 1;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        int pivot = start + ((end - start) / 2);
        if (nums[pivot] == target) return pivot;
        if (start >= end) return -1;
        if (nums[pivot] >= nums[start] && nums[pivot] <= nums[end]) {
            if (target < nums[pivot]) {
                end = pivot - 1;
            } else start = pivot + 1;
        } else if (nums[pivot] >= nums[start] && nums[pivot] >= nums[end]) {
            if (target > nums[pivot] || target < nums[end]) {
                start = pivot + 1;
            } else end = pivot - 1;
        }
        return binarySearch(nums, target, start, end);
    }
}
