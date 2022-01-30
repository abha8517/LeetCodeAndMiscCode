package org.learning.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindtheTownJudge {
    public static void main(String[] args) {
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int n = 4;
        System.out.println(findJudge(n, trust));
    }

    private static int findJudge(int n, int[][] trust) {
        int[] temp = new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            temp[trust[i][0]]--;
            temp[trust[i][1]]++;
        }
        for (int i = 1; i < temp.length; i++) {
            if(temp[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}
