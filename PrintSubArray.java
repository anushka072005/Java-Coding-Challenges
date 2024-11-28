public class PrintSubArray {
    public static void SubArray(int arr[]) {
        int ts = 0;

        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j = i; j < arr.length; j++) {
                int end = j;
                for(int k = start; k <= end; k++) { // print
                    System.out.print(arr[k] + " "); // subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("Total subarray : " + ts);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        SubArray(arr);
    }
}
