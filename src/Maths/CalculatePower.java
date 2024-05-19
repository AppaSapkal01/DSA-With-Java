package Maths;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
//        double ans = calculatePower(num, power);
        double ans = fastExponentiation(num, power);
        System.out.println(ans);
    }

    public static double calculatePower(int num, int power) {
        double result = 1;

        for(int i = 0; i < power; i++) {
            result *= num;
        }

        return result;
    }

    public static double fastExponentiation(int num, int power) {
        double res = 1;

        while(power > 0) {
            if (power % 2 != 0) {
                res = res * num;
            }
            power /= 2;
            num = num * num;
        }
        return res;
    }
}
