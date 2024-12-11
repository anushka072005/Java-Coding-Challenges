public class BubbleSortOptimize {

    public static void bubbleSort(int arr[]) {
        boolean alreadySorted = true; // Assume array is sorted initially

        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0; // Reset swap counter for each pass
            
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++; // Increment swap counter
                }
            }

            // Check if no swaps occurred during the first iteration
            if (i == 0 && swap == 0) {
                System.out.println("Already sorted");
                return; // Exit the method since no sorting is needed
            }

            // If swaps occurred in the first iteration, the array is not initially sorted
            if (swap > 0) {
                alreadySorted = false;
            }
        }
    }

    public static void Printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5}; // Already sorted array for testing

        // bubbleSort(arr);
        // Printarray(arr);

        int arr2[] = {5, 4, 3, 2, 1}; // Unsorted array for testing
        bubbleSort(arr2);
        Printarray(arr2);
    }
}
