public class Inverted_Half_Pyramid_With_Num {

    public static void InvertedHalfPyramid(int n) {

        for(int i=1; i<=n; i++) {

            for(int j=1; j<=(n-i+1); j++) {
                System.err.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedHalfPyramid(5);
    }
}