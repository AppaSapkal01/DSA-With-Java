package Maths;

import java.util.Scanner;
import static Maths.GCDofNum.euclideanGCD;

public class LCMofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = findLCM(num1, num2);
        System.out.println(ans);
    }

    public static int findLCM(int num1, int num2) {
        // lcm(a,b) = (a * b) / gcd(a, b)
        return (num1 * num2) / euclideanGCD(num1, num2);
    }
}
