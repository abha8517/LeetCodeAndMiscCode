package org.learning.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0};
        int target = 7;
        System.out.println(Arrays.toString(twoSums(nums, target)));
    }

    private static int[] twoSums(int[] nums, int target) {
        int[] finalArr = new int[2];
        Map<Integer, Integer> aMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (aMap.containsKey(target - nums[i])) {
                finalArr[0] = aMap.get(target - nums[i]);
                finalArr[1] = i;
                return finalArr;
            } else
                aMap.put(nums[i], i);
        }
        return finalArr;
    }
}
