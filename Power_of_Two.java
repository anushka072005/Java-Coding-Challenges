import java.util.Scanner;


public class Power_of_Two {

    public static boolean powerOftwo(int n) {

        if (n == 0) {
            return false;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            else {
                n = n / 2;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(powerOftwo(n));
        
        sc.close();
    }
}
