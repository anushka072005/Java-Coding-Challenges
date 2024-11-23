/*import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        if (year % 400 == 0){
            System.out.println("Leap Year");
        }
        else if (year % 4 == 0  && year % 100 != 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
        sc.close();
    }    
}
*/

import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int  year = sc.nextInt();
        
        if (year % 4 != 0 ){
            System.out.println("Not Leap year");
        }
        else{
            if(year % 100 != 0){
                System.out.println("Leap year");
            }
            else{
                if (year % 400 != 0){
                    System.out.println("Not Leap year");
                }
                else{
                    System.out.println("Leap year");
                }
            }
        }
        sc.close();
    }
}