import java.util.Scanner;

public class FactorialFunction {
    
    public static int  factorial(int n){
        int fac = 1;
        
        for (int i=1; i<=n; i++){
            fac = fac * i;
        }
        return fac;  // factorial of n
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.println("Factorial of n is : " + factorial(n));

        sc.close();
    }
}
