import java.util.Scanner;

public class UglyNumber {

    public static boolean uglyNumber(int n) {
        if (n <= 0) return false;

        // WAY ONE TO SOLVE THIS
        // while (n % 2 == 0) n /= 2;
        // while (n % 3 == 0) n /= 3;
        // while (n % 5 == 0) n /= 5;

        // WAY TWO TO SOLVE IT
        int primes[] = {2,3,5};
        
        for (int p : primes) {
            while (n % p == 0) {
                n = n / p;
            }
        }

        return n == 1;
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(uglyNumber(n));
    }
}