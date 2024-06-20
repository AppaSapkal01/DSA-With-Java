package ArrayLists;

import java.util.ArrayList;

public class BasicOperation {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        // add new element
        al.add(5);
        al.add(1);

        // get an element at index i
//        System.out.println(al.get(1));

        // print with for loop
//        for(int i = 0; i < al.size(); i++) { // for length of ArrayList size() is used
//            System.out.println(al.get(i));
//        }

        // printing the array list directly
        System.out.println(al);

        // adding element at any index i
        al.add(1, 100);
        System.out.println(al);

        // modifying element at any index i
        al.set(1, 55);
        System.out.println(al);

        // removing an element at index i
//        al.remove(2);
//        System.out.println(al);

        // removing an element e
//        al.remove(Integer.valueOf(55));
//        System.out.println(al);

        // checking if an element exists
        boolean ans = al.contains(100);
        System.out.println(ans);

        // if you don't specify class, you can put anyting inside li
        ArrayList li = new ArrayList();
        li.add('a');
        li.add(1);
        li.add("hello");

        System.out.println(li);
    }
}
