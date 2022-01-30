package org.learning.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean b = wordPattern(pattern, s);
        System.out.println(b);
    }

    private static boolean wordPattern(String pattern, String s) {
        Map<Character, String> aMap = new HashMap<>();
        pattern = pattern.trim();
        s = s.trim();
        String[] strArr = s.split(" ");
        if (pattern.length()!= strArr.length) return false;
        char[] charArr = pattern.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (aMap.containsKey(charArr[i])) {
                if (!aMap.get(charArr[i]).equals(strArr[i])) return false;
            } else if (aMap.containsValue(strArr[i])) return false;
            else aMap.put(charArr[i],strArr[i]);
        }
        return true;
    }
}
