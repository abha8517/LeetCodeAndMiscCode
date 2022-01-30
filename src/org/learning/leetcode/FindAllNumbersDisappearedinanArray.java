package org.learning.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> aList = findDisappearedNumbers(nums);
        System.out.println(aList);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        /*List<Integer> aList = new ArrayList<>();
        int index = 0;
        while (index < nums.length) {
            while (nums[index] - 1 != index) {
                int temp = nums[index];
                nums[index] = nums[temp - 1];
                nums[temp - 1] = temp;
                if (nums[index] - 1 == nums[temp - 1] || nums[index] == nums[nums[index]-1]) {
                    index++;
                }
            }
            index++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                aList.add(i+1);
            }
        }
//        System.out.println(Arrays.toString(nums));
        return aList;*/
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
