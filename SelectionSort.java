public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minpos]) {
                    minpos = j; //smallest number
                }
            }
            // Swap [i = midpos]
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printSortedarray(int arr[]) {
        System.out.println("after sorting");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,7,2,4,1,5};

        selectionSort(arr);
        printSortedarray(arr);
    }
} 