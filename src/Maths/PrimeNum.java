package Maths;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean ans = isPrimeNum(num);

        if(ans) {
            System.out.println(num + "is prime number");
        } else {
            System.out.println(num + "is not prime number");
        }

    }

    public static boolean isPrimeNum(int num) {
        // brute force approach
//        for(int i = 2; i < num; i++) {
//            if(num % i == 0) {
//                System.out.println(num + " is not prime");
//                return;
//            }
//        }
//        System.out.println(num + " is prime");

        // Efficient approach
        int sqroot = (int) Math.sqrt(num);
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <= sqroot; i++) {
            if(num % i == 0){

                return false;
            }
        }
        return true;
    }
}
