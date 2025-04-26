public class QuickSortDndC {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // Baes case
        if(si >= ei) {
            return;
        }

        // Recursive call
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1); // left part
        quickSort(arr, pidx+1, ei); // right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // swap pivot in place of curr i
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        // index of Pivot 
        return i;
    }
    public static void main(String argd[]) {
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
