public class FriendsPairingRecursion {
    public static int friendsPairing(int n) {
        // for n=0
        if (n == 0) {
            return 0;
        }
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }

        // // Choice
        // // Single Friend
        // int fnm1 = friendsPairing(n-1);

        // // Pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = fnm1 * fnm2;

        // // Total number of Pairs
        // int totalWays = fnm1 + pairWays;

        // return totalWays;

        // ("SHORTHAND RRTURN TYPE")
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);

    }
    public static void main(String[] args) {

        System.out.println(friendsPairing(3));

    }
}
