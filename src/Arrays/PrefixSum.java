package Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};

        int[] ans = prefixSum(arr);

        for(int elem : ans) {
            System.out.print(elem + " ");
        }
    }

    public static int[] prefixSum(int[] arr) {

        for(int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1] ;
        }

        return arr;
    }

}
