package Arrays;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                {2,4,1,5,1},
                {7,8,19,2,9},
                {35,9,7,0,1},
                {2,4,9,5,7},
        };
        findMaxSumSubArray(arr2d);
    }

    public static void findMaxSumSubArray(int[][] arr) {
        int MAX = Integer.MIN_VALUE;
        int resIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if(sum > MAX) {
                MAX = sum;
                resIndex = i;
            }
        }
        System.out.println("Maximum sum in subarray is : " + MAX + ", for index " + resIndex);
    }
}
