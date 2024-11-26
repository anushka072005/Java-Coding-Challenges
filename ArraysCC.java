import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) {
        // ARRAY CREATION
        // int Marks[] = new  int [50];
        // int number[] = {1,4,2};
        // String fruits[] = {"apple" , "banana" , "orange"};
        // char spell[] = new char [3];
        // char spell2[] = {'a','b','g'};

        // INPUT/OUTPUT
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //math
        marks[1] = sc.nextInt(); //phy
        marks[2] = sc.nextInt(); //che

        System.out.println("Maths : " + marks[0]);
        System.out.println("Physics : " + marks[1]);
        System.out.println("Chemistry : " + marks[2]);

        // UPDATE MARKS
        marks[1] = marks[1] + 1;
        System.out.println("Updated marks : " + marks[1]);

        // Persentage of all marks
        int Persentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Persentage : " + Persentage + "%");

        // LENGTH OF ARRAY
        System.out.println("length of array : " + marks.length);

        sc.close();
    }
}