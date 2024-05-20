package Maths;

import java.util.Scanner;
import static Maths.PrimeNum.isPrimeNum;
public class PrimeNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printPrimeNumInRange(num);
    }

    public static void printPrimeNumInRange(int num) {
        for (int i = 2; i <= num; i++) {
            // isPrimeNum is function which return if number is prime or not
            if(isPrimeNum(i)){
                System.out.print(i + " ");
            }
        }
    }
}
