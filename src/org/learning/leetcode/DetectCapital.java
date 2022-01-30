package org.learning.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DetectCapital {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("USA");
        aList.add("leetcode");
        aList.add("Goggle");
        aList.add("FlaG");
        aList.add("G");
        aList.add("g");
        aList.add("NIy");
        for (String str:aList) {
            System.out.println(detectCapitalUse(str));
        }
    }

    private static boolean detectCapitalUse(String word) {
        /*if (word.matches("\\b[A-Z][^A-Z]*?\\b")) return true;
        if (word.matches("\\b[A-Z][A-Z]*?\\b")) return true;
        if (word.matches("\\b[a-z][a-z]*?\\b")) return true;
        return false;*/
        return word.matches("[A-Z]*|.[a-z]*");
    }
}
