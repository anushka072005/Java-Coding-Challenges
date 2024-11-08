import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = 25.99f;
        int b = (int)a;
        System.out.println(b);

        float marks = 99.9999f;
        int marks2 = (int)marks;
        System.out.println(marks2);

        float number = 99.999f;
        int number2 = (int)(number);
        System.out.println(number2);

        // float a = 25;
        // int number = (int) a;
        // System.out.println(number);

        char ch = 'a';
        char ch2 = 'b';
        int ch_num = ch;
        int ch_num2 = ch2;
        System.out.println("ASCII val of " + ch +" is : "+ ch_num);
        System.out.println("ASCII val of " + ch2 +" is : "+ ch_num2);
        
        System.out.println("ch + ch2 is : " + (ch + ch2));
        System.out.println("ch + ch2 is : " + (ch_num - ch_num2));
        System.out.println("ch + ch2 is : " + (ch_num2 - ch_num));

        sc.close();
    }
}
