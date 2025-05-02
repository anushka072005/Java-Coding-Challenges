import java.util.ArrayList;
import java.util.Collections;;

public class ArrayListSorting {
    // public static void sort(ArrayList<Integer> list) {

    // }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(3);

        System.out.println("Before Sorting : " + list);

        Collections.sort(list);
        System.out.println("After Sorting :  " + list);

        // Decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Decending Order : " + list);
    }
}
