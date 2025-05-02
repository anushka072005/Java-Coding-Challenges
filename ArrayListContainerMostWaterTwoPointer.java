import java.util.ArrayList;

public class ArrayListContainerMostWaterTwoPointer {

    public static int twoPointer(ArrayList<Integer> height) {
        int maxWater = Integer.MIN_VALUE;
        int lP = 0;
        int rP = height.size()-1;

        while (lP < rP) { 
            // Calc Water Aera
            int ht = Math.min(height.get(lP), height.get(rP));
            int wd = rP - lP;
            int currWater = ht * wd;
            maxWater = Math.max(maxWater, currWater);

            // Update Pointer
            if(height.get(lP) < height.get(rP)) {
                lP++;
            }
            else {
                rP--;
            }
        }

        return maxWater;
    }
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Maximum height is : " + twoPointer(height));
    }
}
