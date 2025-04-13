public class FindUnique {
    public static int uniqueOne(int arr[]) {
        int unique = 0;
        for(int i=0; i<arr.length; i++) {
            unique ^= arr[i];
        }    
        return unique;
    }
    public static void main(String[] args) {
        int arr[] = {5,1,2,2,4,5,1};
        
        System.out.println(uniqueOne(arr));
    }
}
