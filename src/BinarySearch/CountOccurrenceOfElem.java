package BinarySearch;
import static BinarySearch.FirstOccurrence.firstOccurElem;

public class CountOccurrenceOfElem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 5, 6, 7};
        int ans = countAllOccurrence(arr, 0);
        System.out.println(ans);
    }

    public static int countAllOccurrence(int[] arr, int target) {
        int ans = -1;
        int first = firstOccurElem(arr, target, true);
        int last = firstOccurElem(arr, target, false);

        if(first == -1) {
            return ans;
        } else {
            ans = last - first + 1;
        }
        return ans;
    }
}
