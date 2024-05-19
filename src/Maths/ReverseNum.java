package Maths;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int reverseNum = reverseNumber(num);
        System.out.println(reverseNum);
    }

    public static int reverseNumber(int num) {
        int result = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return result;
    }
}
