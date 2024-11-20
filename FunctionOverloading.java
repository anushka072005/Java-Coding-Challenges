public class FunctionOverloading {

    public static int sum(int a, int b) {
        return a+b;        
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of a:b = " + sum(10, 5));
        System.out.println("Sum of a:b:c = " + sum(10, 5,5));
    }
}
