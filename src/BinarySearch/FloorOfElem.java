package BinarySearch;

// FLOOR => The largest integer that is less than or equal to the given number
public class FloorOfElem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 8, 8, 9, 15};
        int ans = floorOfElem(arr, 10);
        System.out.println(ans);
    }

    public static int floorOfElem(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                ans = arr[mid];
                return ans;
            } else if (arr[mid] < target) {
                start = mid + 1;
                ans = arr[mid];
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

}
