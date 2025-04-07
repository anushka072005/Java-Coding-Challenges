public class FindClosestNumtoZero {

    public static int findNearest(int nums[]) {
        int closest = nums[0];

        for(int i=1; i<nums.length; i++) {
            int current = nums[i];
 
            if (Math.abs(current) < Math.abs(closest)) {
                closest = current;
           }
            else if (Math.abs(current) == Math.abs(closest) && current > closest) {
                // prefer positive if tie
                closest = current;
           }
        }

        return closest;
    }

    public static void main(String args[]) {
        int nums[] = {-4, -1, 1, 4, 8};

        System.out.println(findNearest(nums));
    }
}
