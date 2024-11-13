import java.util.Scanner;

public class StarPettern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for star pettern : ");
        int n = sc.nextInt();

        for (int line = 1 ; line <= n ; line++){

            for (int star = 1 ; star <=(n-line+1) ; star++)
            // for (int star = n ; star >= line ; star--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
