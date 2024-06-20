package ArrayLists;

import java.util.ArrayList;

public class Add2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {9, 9, 5, 8};
        int[] arr2 = {6, 7};

        System.out.println(add2Arrays(arr1, arr2));
    }

    public static ArrayList<Integer> add2Arrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> al = new ArrayList<>();

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;

        while(i >= 0 || j >= 0) {
            int sum = 0;

            if(i >= 0) {
                sum += arr1[i];
            }

            if(j >= 0) {
                sum += arr2[j];
            }

            sum += carry;

            int rem = sum % 10;
            carry = sum / 10;

            al.add(0, rem);
            i--;
            j--;

        }

        if(carry != 0) {
            al.add(0, carry);
        }

        return al;
    }
}
