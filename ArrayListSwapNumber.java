import java.util.ArrayList;

public class ArrayListSwapNumber {

    public static void SwapNumber(ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int indx1 = 2, indx2 = 4;

        System.out.println("Before Swaping : " + list);
        SwapNumber(list, indx1, indx2);
        System.out.println("After Swaping : " + list);
    }
}
