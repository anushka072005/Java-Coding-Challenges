import java.util.*;

public class BinomialCoefficient{

    public static int factorial(int n){ // function for factorial
        int fac = 1;
        
        for (int i=1; i<=n; i++){
            fac = fac * i;
        }
        return fac;  // factorial of n
    }

    public static int binCoeff(int n, int r) { // function for Binomial coefficient

        int fac_n = factorial(n); // can to the factorial for n
        int fac_r = factorial(r); // call for r
        int fac_nmr = factorial(n-r); //call for (n-r)

        int binCoeff = fac_n / (fac_r * fac_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();

        System.out.println("Binomial Coefficient is : " + binCoeff(n,r));

        sc.close();
    }
}
