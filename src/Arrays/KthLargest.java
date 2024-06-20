package Arrays;
import static Arrays.FindMax.findMaxElem;
public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {1, 6, 21, 9, 2, 15};

//        int ans = findKthLargest(arr, 2);
        int ans = find2ndLargest(arr);
        System.out.println(ans);
    }

    public static int findKthLargest(int[] arr, int k) {
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < k; i ++) {
            int max = findMaxElem(arr);

            for(int j = 0; j < arr.length; j++) {
                if (arr[j] == max) {
                    arr[j] = Integer.MIN_VALUE;
                    break;
                }
            }
            ans = max;
        }

        return ans;
    }

    public static int find2ndLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
