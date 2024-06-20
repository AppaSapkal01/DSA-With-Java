package BinarySearch;
import static BinarySearch.BinarySearch.binarySearch;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 5, 6, 7};
        int ans = firstOccurElem(arr, 4, true);
        System.out.println(ans);
        int ans2 = firstOccurElem(arr, 4, false);
        System.out.println(ans2);
    }

    public static int firstOccurElem(int[] arr, int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                ans = mid;
                if(isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
