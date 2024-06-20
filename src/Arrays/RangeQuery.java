package Arrays;
import java.util.Scanner;

import static Arrays.PrefixSum.prefixSum;
public class RangeQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array ");
        int size = sc.nextInt();

        int[] arr = new int[size + 1];

        for(int i = 1; i <= size; i++) {
            System.out.print("Enter element in an array ");
            arr[i] = sc.nextInt();
        }

//        System.out.print("Enter number of queries ");
//        int q = sc.nextInt();

        int[] prefSum = prefixSum(arr);

        for(int elem : prefSum) {
            System.out.print(elem + " ");
        }

//        while(q-- > 0) {
//            System.out.print("Enter range from ");
//            int frm = sc.nextInt();
//            System.out.print("Enter range to ");
//            int to = sc.nextInt();
//            int ans = prefSum[frm] - prefSum[to-1];
//
//            System.out.println(ans);
//        }

    }

}
