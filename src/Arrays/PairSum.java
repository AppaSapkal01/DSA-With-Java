package Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 7, 9, 5, 3};

        int ans = findPairSum(arr, 8);
        System.out.println(ans);
    }

    public static int findPairSum(int[] arr, int target) {
        int ans = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }

        return ans;
    }


}
