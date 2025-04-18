public class PrintDigitsInStringRecursion {

    static String words[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int n) {
        // BaseCase
        if(n == 0) {
            return;
        }

        int lastdigit = (n % 10);
        printDigits(n / 10);
        System.out.print(words[lastdigit] + " ");

    }
    public static void main(String[] args) {
        printDigits(1234);
    }
}
