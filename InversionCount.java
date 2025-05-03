public class InversionCount {
    // Approach 1- Brute Force Approach
    public static int inversionCount(int nums[]) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Approach 2- Modified Merge Sort
    public static void printArr(int nums[]) {
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int mergeSort(int nums[], int si, int ei) {
        // work
        if(si < ei) {
            int mid = si + (ei - si) / 2;  // Mid

            int leftInvCount = mergeSort(nums, si, mid); // Left Part
            int rightInvCount = mergeSort(nums, mid + 1, ei); // Right Part
            
            int invCount = merge(nums, si, mid, ei);

            return leftInvCount + rightInvCount + invCount;
        }

        return 0;
    }

    public static int merge(int nums[], int si, int mid, int ei) {
        // tepm arr[] EXAMPLE : (SIZE = si(0,2)= 3 ei(3,5)=3 -> 5-0+1=6)
        int temp[] = new int[ei-si+1];
        // ITERATORS
        int i = si; // iterator for left sorted part
        int j = mid+1;  // iterator for right sorted part
        int k = 0;  // iterator for temp arr
        int invCount = 0;

        // AFTER SORTING COMPARE ELEMENTS FROM LEFT AND RIGHT PART AND STORE IN TEMP[]
        while (i <= mid && j <= ei) {
            if(nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            }
            else {
                temp[k] = nums[j];
                j++;
                invCount += (mid-i+1);
            }
            k++;
        }

        // leftOver Elements for left sorted part        
        while (i <= mid) { 
            temp[k++] = nums[i++];
        }
        // leftOver Elements for right sorted part    
        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        // COPY TEMP[] INTO ORIGINAL ARRAY
        for(k=0, i=si; k<temp.length; k++,i++) {
            nums[i] = temp[k];
        }

        return invCount;
    }

    public static void main(String[] args) {
        int nums[] = {1, 20, 6, 4, 5};
        // System.out.println("Max inversions are : " + inversionCount(nums));
        // mergeSort(nums, 0, nums.length-1);
        System.out.println("Maximum Inversion : " + mergeSort(nums, 0, nums.length-1));
        printArr(nums); 
    }
}
