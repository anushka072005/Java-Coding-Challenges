public class Update_Ith_bit {

    public static int clearIthbit(int n, int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int setIthbit(int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int updateIthbit(int n, int i, int newBit) {
        // 1-WAY WITH SIMPLE SOLUTION
        // if(newBit == 0) {
        //     return clearIthbit(n, i);
        // }
        // else {
        //     return setIthbit(n, i);
        // }

        // 2-WAY USING CLEAR METHOD
        n = clearIthbit(n, i);
        int Bitmask = newBit << i;
        return n | Bitmask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthbit(10, 2, 1));
        System.out.println(updateIthbit(10, 1, 0));
    }
}
