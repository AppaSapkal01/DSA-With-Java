package Maths;

import java.util.Scanner;
import static Maths.CountDigit.countDigit;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean ans = isArmstrongNum(num);
        System.out.println(ans);
    }

    public static boolean isArmstrongNum(int num) {
        int count = countDigit(num); // instead of writing logic again, I have used countDigit function which I have made earlier.
        int copy = num;
        int res = 0;
        while(num > 0) {

            int digit = num % 10;
            res += (int) Math.pow(digit, count);
            num /= 10;
            if(res == copy) {
                return true;
            }
        }

        return false;
    }
}
