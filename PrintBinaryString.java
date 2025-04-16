public class PrintBinaryString {
    public static void printBinString(int n, int lastplace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return; 
        }

        // Kaam
        printBinString(n-1, 0, str+"0");

        if(lastplace == 0) {
            printBinString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinString(3, 0, "");
    }
}


// binary strings of length n such that no two 0s are adjacent.
/*public class PrintBinaryString {
    public static void printBinString(int n, int lastplace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return; 
        }

        // Kaam
        printBinString(n-1, 1, str+"1");

        if(lastplace == 1) {
            printBinString(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        printBinString(2, 1, "");
    }
} */