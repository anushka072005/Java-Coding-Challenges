public class Smallest {

    public static int FindSmallest(int numbers[]) {

        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) { // if number[i] smaller than smallest
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,3,5,2,8,3};

        System.out.println("Smallest : " + FindSmallest(numbers));
    }
}
