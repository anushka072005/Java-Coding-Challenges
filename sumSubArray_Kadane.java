public class sumSubArray_Kadane {

    public static void maxsSum(int numbers[]) {

        int maxSum = Integer.MIN_VALUE; // Initialize maxSum
        int currSum = 0; // Initialize currSum
        int prefix[] = new int[numbers.length];

        // Step 1: Calculate Prefix Array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Step 2: Compare Prefix Values with Max Sum
        for (int i = 0; i < prefix.length; i++) {
            currSum = prefix[i]; // Current prefix value
            maxSum = Math.max(maxSum, currSum); // Compare with maxSum
        }

        System.out.println("max sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxsSum(numbers);
    }
}