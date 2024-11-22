public class Inverted_Rotated_half_pyramid {

    public static void Inverted_Rotated(int n) {

        for (int i=1; i<=n ; i++){
            //Spaces
            for(int j=1 ; j<=n-i ; j++) {
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inverted_Rotated(5);  
    }
}
