package Maths;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        float ans = (float) calculateSqRoot(num);
        System.out.println(ans);
    }

    public static double calculateSqRoot(int num) {
        // using Newton Raphson formula
        double tol = 0.0001;
        double root;
        double X = num;
        while(true) {
            root = 0.5 * (X + (num / X));
            double ans = X - root;
            if(ans < tol) {
                break;
            }
            X = root;
        }
        return root;
    }

}
