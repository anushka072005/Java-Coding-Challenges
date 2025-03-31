public class Clear_Ith_lastbit {
    public static int clearIthLastbit(int n, int i) {
        int bitmask = (~0) << i; // or
        // int bitmask = -1 << i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthLastbit(15,2));
    }
}
