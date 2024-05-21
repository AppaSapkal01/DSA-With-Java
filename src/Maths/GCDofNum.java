package Maths;

import java.util.Scanner;

public class GCDofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

//        int ans = findGCD(num1, num2);
        int ans = euclideanGCD(num1, num2);

        System.out.println(ans);
    }

    public static int findGCD(int num1, int num2){
        int min = (num1 <= num2) ? num1 : num2;
        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int euclideanGCD(int num1, int num2) {
//        while(num1 != 0 && num2 != 0) {
//            if(num1 > num2) {
//                num1 -= num2;
//            } else {
//                num2 -= num1;
//            }
//        }
//        int res = num1;
//        if(num1 == 0) {
//            res = num2;
//        }
//        return res;

        //efficient EuclideanGCD method
        while(num1 != 0 && num2 != 0) {
            if(num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        int res = num1;
        if(num1 == 0) {
            res = num2;
        }
        return res;
    }
}
