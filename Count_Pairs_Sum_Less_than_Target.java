public class Count_Pairs_Sum_Less_than_Target {
    
    public static void makePairsCompairWithTarget(int nums[],int target) {

        // this is for array
        int tp = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] < target) { 
                    tp++;
                }
            }
        }
        System.out.print("Total pairs : " + tp);
    }

    public static void main(String args[]) {

        int nums[] = {-1, 1, 2, 3, 1};
        int target = 2;

        makePairsCompairWithTarget(nums, target);
    }
}

// this is for list (for list we use size() function instead of length and use get() instead of nums[i] and nums[j])
/*import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int tp = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) { // Use nums.get(i) instead of nums[i]
                    tp++;
                }
            }
        }
        return tp; // Fixed typo
    }
}
*/