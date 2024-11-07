import java.util.Scanner;

public class CheckFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your fever : ");
        float temp = sc.nextFloat();

        if (temp >= 100){
            System.out.println("I have a Fever");
        }
        else {
            System.out.println("I have not fever");
        }
        sc.close();
    }
}
