package Maths;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println(checkLeapYear(20012));

    }

    public static boolean checkLeapYear(int year) {
        boolean ans;

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                   return true;
                } else {
                  return false;
                }
            }
            ans = true;
        } else {
            ans = false;
        }

        return ans;
    }
}
