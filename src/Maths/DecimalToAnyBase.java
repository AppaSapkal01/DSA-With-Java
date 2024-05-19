package Maths;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalValue = sc.nextInt();
        int toBase = sc.nextInt();
        int ans = decimalToAnyBase(decimalValue, toBase);
        System.out.println(ans);
    }

    static int decimalToAnyBase(int decimal, int base) {
        int resNum = 0;
        int power = 0;

        while ( decimal > 0) {
            int rem = decimal % base;
            decimal /= base;
            resNum += (int) (rem * Math.pow(10, power));

            power++;
        }
        return resNum;
    }
}
