public class CheckPowerOf2ornot {
    public static boolean checkPowerof2_or_not(int n) {
        return (n & (n-1)) == 0;
    }
    public static void main(String args[]) {
        System.out.println(checkPowerof2_or_not(5));
    }
}
