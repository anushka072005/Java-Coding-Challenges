public class MethodOverloadingPolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(10, 20));
        System.out.println(calc.sum(1.5f, 2.1f));
        System.out.println(calc.sum(40, 50, 10));
    }
}

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }
    float sum(float a, float b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Function overloading = same function name with different parameters. compile time poly