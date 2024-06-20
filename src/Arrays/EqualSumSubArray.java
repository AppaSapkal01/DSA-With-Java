package Arrays;

public class EqualSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1,7, 5, 2, 6};

        if(equalSumPartition(arr)) {
            System.out.println("Equal Partition Possible");
        } else {
            System.out.println("Equal partition is not possible");
        }
    }

    public static boolean equalSumPartition(int[] arr){
        int total = findArraySum(arr);

        int prefSum = 0;
        for(int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = total - prefSum;
            if(suffixSum == prefSum) {
                return true;
            }
        }

        return false;
    }

    public static int findArraySum(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
