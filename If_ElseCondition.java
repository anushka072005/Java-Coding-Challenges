import java.util.*;

public class If_ElseCondition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("Adult");
        }

        if (age >= 13 && age < 18 ){
            System.out.println("Teenager");
        }

        else{
            System.out.println("Not Adult");
        }
        sc.close();
    }
}
