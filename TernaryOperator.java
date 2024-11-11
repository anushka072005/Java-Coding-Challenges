public class TernaryOperator {
    public static void main(String[] args) {
        int number = 4;
        int age = 99;
        int marks = 24;

        //ternary operator
        String type = ((number%2) == 0) ? "even" : "odd";
        System.out.println(type);

        String ageChecker = (age > 18) ? "Adult" : "Not Adult";
        System.out.println(ageChecker);

        String result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(result);
    }    
}
