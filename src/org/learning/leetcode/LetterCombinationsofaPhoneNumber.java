package org.learning.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    private static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits == null || digits.length() < 1){
            return res;
        }
        String[] arr = new String[]{"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        generate(digits, arr, res, new StringBuilder(), 0);
        return res;
    }

    private static void generate(String digits, String[] arr, List<String> res, StringBuilder sb,int start){
        if(sb.length()== digits.length()){
            res.add(sb.toString());
            return;
        }
        String str = arr[Character.getNumericValue(digits.charAt(start))];
        for(int i = 0; i<str.length(); i++){
            sb.append(str.charAt(i));
            generate(digits,arr, res, sb, start+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
