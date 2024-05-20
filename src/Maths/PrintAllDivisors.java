package Maths;

import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        printAllDivisors(num);
    }

    public static void printAllDivisors(int num) {
        // Brute force approach
//        for(int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                System.out.println(i + " is a divisor of " + num);
//            }
//        }

        // Efficient Approach
        int counter = 1;
        int sqroot = (int)Math.sqrt(num);
        while(counter <= sqroot){
            if(num % counter == 0){
                System.out.println(counter + " is a divisor of " + num);
                int otherNumber = num / counter;
                if(otherNumber != counter) {
                    System.out.println(otherNumber + " is a divisor of " + num);
                }
            }
            counter++;
        }
    }

}
