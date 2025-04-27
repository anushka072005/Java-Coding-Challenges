public class AddBinary {
    public static String addBinary(String a, String b) {

        //Convert String into int
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;  // Add the numbers
        return Integer.toBinaryString(sum);   // Convert the sum back to binary
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        System.out.println(addBinary(a, b));
    }      
}  
