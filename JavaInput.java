import java.util.*;
public class JavaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(input);

        String input_2 = sc.nextLine();
        System.out.println(input_2);

        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        byte by = sc.nextByte();
        System.out.println(by);

        short sh = sc.nextShort();
        System.out.println(sh);

        double largefloat = sc.nextDouble();
        System.out.println(largefloat);

        float flo = sc.nextFloat();
        System.out.println(flo);

        long largenum = sc.nextLong();
        System.out.println(largenum);
        
        sc.close();
    }
}