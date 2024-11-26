public class ArrayFunctionArgument {

    public static void update(int marks[], int nonchangable) {
        nonchangable = 10;
        for(int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {98, 97 ,95};
        int nonchangable = 5;
        System.out.println(nonchangable);
        update(marks,nonchangable);

        // Print our marks
        for(int i=0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
