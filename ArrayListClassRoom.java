// import java.util.*;
import java.util.ArrayList;

public class ArrayListClassRoom {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();
        // ArrayList<String> list3 = new ArrayList<>();
        // ArrayList<Character> list4 = new ArrayList<>();

        // Add operation
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("Original Arraylist : " + list1);

        // set operation
        list1.set(2, 7);

        // get operation
        int element = list1.get(3);
        System.out.println("Element is = " + element);

        // remove operation
        list1.remove(3);   // Index = 3

        // Contains operation 
        System.out.println(list1.contains(3));
        System.out.println(list1.contains(2));

        System.out.println("Size of list is : " + list1.size());

        System.out.println(list1);

        // Special Add operation
        list1.add(2, 3);
        System.out.println(list1);


        System.out.println("\nTraverse ArrayList : Output");
        // Traverse ArrayList Using for loop
        for(int i=0; i<list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

    }
}
