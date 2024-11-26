public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] > key) {  // left
                end = mid - 1;
            }
            else { //right
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] =  {2, 5, 7, 9, 11, 20, 25}; // must sort
        int key = 25;

        System.out.println( "key value at index : " + binarySearch(arr, key));
    }
}