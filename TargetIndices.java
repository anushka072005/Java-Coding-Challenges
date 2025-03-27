import java.util.*;

public class TargetIndices {

    //" * USE ARRAY.SORT INSTEAD OF WRITE ALL CODE OF SORTING * "
    // public static void targetIndices(int[] arr, int target) {
    public static List<Integer> targetIndices(int[] arr, int target) {

        // Step 1: Find the largest value in the array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Counting Sort
        int count[] = new int[largest + 1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 3: Reconstruct sorted array
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // Arrays.sort(arr);

        // Step 4: Find target indices
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if (target == arr[i]) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,2,3};
        int target = 3;

        List<Integer> indices = targetIndices(arr,target);
        System.out.println(indices);

        System.out.println(Arrays.toString(arr));
    }
}
