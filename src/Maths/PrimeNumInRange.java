package Maths;

import java.util.Arrays;
import java.util.Scanner;
import static Maths.PrimeNum.isPrimeNum;
public class PrimeNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printPrimeNumInRange(num);
    }

    public static void printPrimeNumInRange(int num) {
//        for (int i = 2; i <= num; i++) {
//            // isPrimeNum is function which return if number is prime or not
//            if(isPrimeNum(i)){
//                System.out.print(i + " ");
//            }
//        }
//
//        if (num < 2) {
//            return;
//        }

        //Sieve of Eratosthenes algorithm
        boolean[] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime numbers

        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
