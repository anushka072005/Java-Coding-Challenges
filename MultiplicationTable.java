import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for tabel : ");
        int n = sc.nextInt();
        // int i ; // outside declaretion

        for (int i = 1 ; i <= 10 ; i++){

            System.out.println(n + " X " + i + " = " + n*i);
        }
        // System.out.println(i);
        sc.close();
    }
}