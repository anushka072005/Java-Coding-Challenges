public class Factorial {
    public static int fact(int n) {
        int fac;
        if(n == 0) {
            return 1;
        }
 
        fac = n * fact(n-1);
        return fac;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
