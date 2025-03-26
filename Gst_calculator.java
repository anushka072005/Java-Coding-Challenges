import java.util.Scanner;

public class gst_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = (pencil + pen + eraser);
        System.out.println("Total of 3 items : " + total);

        //Add on - with 18% tax
        float GST = total * 0.18f ;
        System.out.println("GST is : " + GST);

        float billWithGST = total + GST ;
        System.err.println("Bill with 18% tax : " + billWithGST);

        sc.close();
    }
}
