import java.util.ArrayList;
//Time Com = O(n)
public class ArrayListMonotonic {

    public static boolean monotonicArrayList(ArrayList<Integer> list) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for(int i=1; i<list.size(); i++) {
            if (list.get(i) > list.get(i-1)) {
                isDecreasing = false;
            }
            if (list.get(i) < list.get(i-1)) {
                isIncreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        System.out.println("Arraylist = " + list);

        if(monotonicArrayList(list)) {
            System.out.println("ArrayList is Monotonic");
        }
        else {
            System.out.println("ArrayList is not Monotonic");
        }
    }
}
