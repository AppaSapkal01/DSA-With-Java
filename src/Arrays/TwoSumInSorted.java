package Arrays;

public class TwoSumInSorted {
    public static void main(String[] args) {
        int[] arr = {-1,0};

        int[] ans = twoSum(arr, -1);

        for(int elem : ans) {
            System.out.print(elem + " ");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (arr[i] + arr[j] == target) {
                return new int[] {i+1, j+1};
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[] {-1, -1};
    }
}
