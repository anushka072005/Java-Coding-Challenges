public class TypePromotion {
    public static void main(String[] args) {
        int a = 25;
        float b = 12.1f;
        long c = 2733333;
        char d = 'a';
        float total = a + b + c + d;
        System.out.println(total); // it automatically converted into float (higher precesion)

        // int total = a + b + c + d;
        int result = (int)(a + b + c + d);  // thorugh Typecasting can be converted into int
        System.out.println(result);


        char x = 'a';
        char y = 'b';
        // char z = x-y;   //cant converts int to char
        System.out.println((int)(x));
        System.out.println((int)(y));
        System.out.println(y-x);

        byte n = 5;
        // n = n * 2;
        n = (byte)(n * 2);
        System.out.println(b);

        System.out.println((a+b*c/d));

        // byte b = 4;
        // char c = 'a';
        // short s = 512; 
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;

        // double result = (f * b) * (i % c) - (d * s);
        
    }
}
