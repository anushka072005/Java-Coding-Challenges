public class MergeSortDndC {
    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }

        // work
        int mid = si + (ei - si) / 2;  // Mid
        mergeSort(arr, si, mid); // Left Part
        mergeSort(arr, mid + 1, ei); // Right Part
        
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // tepm arr[] EXAMPLE : (SIZE = si(0,2)= 3 ei(3,5)=3 -> 5-0+1=6)
        int temp[] = new int[ei-si+1];
        // ITERATORS
        int i = si; // iterator for left sorted part
        int j = mid+1;  // iterator for right sorted part
        int k = 0;  // iterator for temp arr

        // AFTER SORTING COMPARE ELEMENTS FROM LEFT AND RIGHT PART AND STORE IN TEMP[]
        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // leftOver Elements for left sorted part        
        while (i <= mid) { 
            temp[k++] = arr[i++];
        }
        // leftOver Elements for right sorted part    
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // COPY TEMP[] INTO ORIGINAL ARRAY
        for(k=0, i=si; k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
