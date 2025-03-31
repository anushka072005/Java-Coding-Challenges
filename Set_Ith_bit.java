public class Set_Ith_bit {

    public static int setIthbit(int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(setIthbit(10, 2));
    }
}
