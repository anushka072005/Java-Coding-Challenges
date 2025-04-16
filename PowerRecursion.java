public class PowerRecursion {
    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }

        int powMulti = (x * power(x, n-1));
        return powMulti;
    }
    public static void main(String[] args) {

        System.out.println(power(2, 5));
    }
}
