public class Clear_Ith_bit {
    public static int clearIthbit(int n, int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthbit(4, 2));
        System.out.println(clearIthbit(12, 2));
    }
}
