

import java.util.Scanner;

public class AreaofSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();

        float areaOfSquare = side* side;

        System.out.println("Area of Square is : " + areaOfSquare);

        sc.close();
    }   
}
