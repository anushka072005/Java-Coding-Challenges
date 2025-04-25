public class FindAllOccurenceKeyRecursion {
    public static void findkey(int arr[], int key, int idx) {
        if(idx == arr.length) {
            return;
        }

        // Work
        if(arr[idx] == key) {
            System.out.print(idx + " ");
        }

        findkey(arr, key, idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        findkey(arr, key, 0);
    }
}
