package Maths;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean ans = isPallindromeNum(num);
        System.out.println(ans);
    }

    public static boolean isPallindromeNum(int num) {
        int res = 0;
        int copy = num;

        while (num > 0) {
            int lastDigit = num % 10;
            res = res * 10 + lastDigit;
            num /= 10;

            if (res == copy) {
                return true;
            }
        }
        return false;
    }
}
