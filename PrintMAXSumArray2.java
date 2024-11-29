// Prefix Sum method
// Purpose: Finds the maximum sum of all subarrays, not just cumulative from the start.

public class PrintMAXSumArray2 {
    public static void maxsSum(int numbers[]) {

        int currsum = 0;
        int maxsSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // Calculate Prefix
        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) { 
            int start = i;
            for(int j = 0; j < numbers.length; j++) {
                int end = j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(maxsSum < currsum) {
                    maxsSum = currsum;
                }
            }
        }
        System.out.println("max sum : " + maxsSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};

        System.out.println(numbers.length);
        maxsSum(numbers);        
    }
}



// Purpose: Finds the maximum prefix sum, which is cumulative from the start of the array.
// this is for only single iteration for i = 0 index
/* 
public class PrintMAXSumArray2 {

    public static void subarraySum_prefix_sum(int arr[]) {
        int currsum = 0;
        int maxSum = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];

        // step-1 calc prefix sum
        prefix[0] = arr[0];
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // step-2 compare prefix val with maxsum
        for(int i = 0; i < prefix.length; i++) {
            currsum = prefix[i]; // current prefix val
            maxSum = Math.max(maxSum, currsum); // compare with maxsum
        }

        System.out.println("max sum : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};

        subarraySum_prefix_sum(arr);

    }
}
*/
