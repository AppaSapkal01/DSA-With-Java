package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 11, 45, 87, 90};
        int[] arr2 = {90, 85, 75, 62, 47, 11, 8};
//        System.out.println("element found at pos : " + binarySearch(arr, 7));
//        System.out.println("element found at pos : " + binarySearchDesc(arr2, 47));

        System.out.println("element found at pos : " + binarySearchOrderAgnostic(arr, 7));
        System.out.println("element found at pos : " + binarySearchOrderAgnostic(arr2, 11));

    }

    public static int binarySearch(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return ans = mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static int binarySearchDesc(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return ans = mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int binarySearchOrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if(arr[start] <= arr[end]) {
            return binarySearch(arr, target);
        } else {
            return binarySearchDesc(arr, target);
        }
    }
}
