package org.learning.leetcode;

import java.util.Arrays;

public class RobotBoundedInCircle {
    public static void main(String[] args) {
        String instructions = "GGLLGG";
        System.out.println(isRobotBounded(instructions));
    }

    private static boolean isRobotBounded(String instructions) {
        boolean flag = false;
        if (instructions == null || instructions.equals(""))
        return false;
        String direction = "North";
        int x = 0;
        int y = 0;
        char[] str = instructions.toCharArray();
        for (char ch:str) {
            switch (ch){
                case 'G':{
                    if (direction.equals("North")) y++;
                    else if (direction.equals("West")) x--;
                    else if (direction.equals("South")) y--;
                    else if (direction.equals("East")) x++;
                    break;
                }
                case 'L':{
                    if (direction.equals("North")) direction = "West";
                    else if (direction.equals("West")) direction = "South";
                    else if (direction.equals("South")) direction = "East";
                    else if (direction.equals("East")) direction = "North";
                    break;
                }
                case 'R':{
                    if (direction.equals("North")) direction = "East";
                    else if (direction.equals("West")) direction = "North";
                    else if (direction.equals("South")) direction = "West";
                    else if (direction.equals("East")) direction = "South";
                    break;
                }
            };
        }
        if ((x==0 && y==0) || !direction.equals("North")){
            flag = true;
        }
        return flag;
    }
}
