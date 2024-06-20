package Arrays;
import static Arrays.FindMin.findMinElem;
public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {-6, 1, 4, 6, 8, 10};
        int ans = findKthSmallest(arr, 1);
        System.out.println(ans);
    }

    public static int findKthSmallest(int[] arr, int k) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            int min = findMinElem(arr);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == min) {
                    arr[j] = Integer.MAX_VALUE;
                    break;
                }
            }
            ans = min;
        }
        return ans;
    }
}
