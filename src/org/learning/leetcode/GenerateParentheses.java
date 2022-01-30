package org.learning.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    private static List<String> generateParenthesis(int n) {
        /*List<String> str = new ArrayList<>();
        Set<String> strSet = new HashSet<>();
        str.add("()");
        if (n==1) return str;
        for (int i = 2; i <= n; i++) {
            for (String s:str) {
                strSet.add("("+s+")");
                for (int j = 0; j < s.length(); j++) {
                    strSet.add(s.substring(0,j)+"()"+s.substring(j));
                }
            }
            str = new ArrayList<>(strSet);
            strSet.clear();
        }
        return str;*/
        return helper(n);
    }

    private static List<String> helper(int n) {
        if (n==1) return List.of("()");
        Set<String> strSet = new HashSet<>();
        List<String> str = helper(n-1);
        for (String s:str) {
            strSet.add("("+s+")");
            for (int j = 0; j < s.length(); j++) {
                strSet.add(s.substring(0,j)+"()"+s.substring(j));
            }
        }
        return new ArrayList<>(strSet);
    }
}
