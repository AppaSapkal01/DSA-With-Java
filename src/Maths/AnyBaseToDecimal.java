package Maths;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        int ans = anyBaseToDecimal(num, base);
        System.out.println(ans);
    }

    static int anyBaseToDecimal(int num, int base) {
        int resNum = 0;
        int power = 0;

        while(num > 0) {
            int unitDigit = num % 10;
            num /= 10;
            resNum += (int) (unitDigit * Math.pow(base, power));
            power++;
        }
        return resNum;
    }
}
