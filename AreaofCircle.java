
import java.util.*;

public class AreaofCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        float r = sc.nextFloat();
        float areaOfCircle = pi * r * r;
        System.out.println(areaOfCircle);

        sc.close();
    }
}  
 