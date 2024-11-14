import java.util.*;

public class display_non_multiples_of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter number : ");
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            if (n % 10 == 0){
                continue;
            }
            System.out.println(n);
        }
        sc.close();
    }
}
