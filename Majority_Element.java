// import java.util.*;

// TC: O(n) , SC: O(1)
public class Majority_Element {

    public static int majorityElement(int nums[]){

        int freq = 0 ; int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                ans = nums[i];
            }
            if (ans == nums[i]) {
                freq++;
            }
            else {
                freq--;
            }
        }

        
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == ans) { 
                count++;  // Count occurrences of candidate
            }
        }

        if (count > nums.length/2) {
            return ans;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};

        System.out.println(majorityElement(nums));
    }
}
/* // THIS IS NOT SATISFY CONDITION FOR MAJORITY ELEMENT
public class Majority_Element {
    public static void majorityElement(int nums[]) {

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++) {
            largest = Math.max(largest,nums[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0; i<nums.length; i++) {
            count[nums[i]]++;
        }

        int bigcount = Integer.MIN_VALUE;
        int numWithBigCount = -1 ;    // -1 because if no value found return default val
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] > bigcount) {
                bigcount = count[i];    // Update max frequency
                numWithBigCount = i;     // Store the number
            }
        }
        System.out.println(numWithBigCount);

    }
    
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        
        majorityElement(nums);
    }

}
// int j = 0;
// for(int i = 0; i<count.length; i++) {
//     while (count[i] > 0) {
//         nums[j] = i;
//         j++;
//         count[i]--;
//     }
// }
*/