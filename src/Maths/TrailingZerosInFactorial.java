package Maths;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findTrailingZerosInFactorial(num);
    }

    public static void findTrailingZerosInFactorial (int num) {
        int res = 0;

        for (int i = 5; i <= num; i = i * i) {
            res = res + (num / i);
        }

        System.out.println(res);
    }
}
