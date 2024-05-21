package Maths;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(findFactorial(num));

    }

    public static double findFactorial(int num) {
        double fact = 1;

        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
