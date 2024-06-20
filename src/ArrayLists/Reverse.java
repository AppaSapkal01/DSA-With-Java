package ArrayLists;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println("Original list " + al);
        reverseList(al);
        System.out.print("Reverse list " + al);

    }

    public static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;

        while(i < j) {
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
}
