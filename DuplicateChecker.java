import java.util.Scanner;

public class DuplicateChecker {
 
    public static boolean TestDuplicates(int nums[]) { 

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Exit the function once a duplicate is found
                }
            }
        }
        return false;    // If no duplicates are found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element in array : ");
        int n = sc.nextInt();

        int nums[] = new int[n]; // create array

        System.out.println("Enter array elements : ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean show = TestDuplicates(nums);
        System.out.println(show);

        sc.close();
    }
}
