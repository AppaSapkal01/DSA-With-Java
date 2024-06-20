package ArrayLists;

import java.util.ArrayList;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        System.out.println(intersection(arr1, arr2));
    }

    public static ArrayList<Integer> intersection(int[] arr1, int[]arr2) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] > arr2[j]) {
                j++;
            } else if(arr1[i] < arr2[j]) {
                i++;
            } else {
                if(al.isEmpty() || !al.contains(arr1[i])) {
                    al.add(arr1[i]);
                }

                i++;
                j++;
            }
        }
        return al;
    }
}
