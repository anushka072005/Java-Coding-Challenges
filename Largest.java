public class Largest {
    public static int FindLargest(int numbers[]) { 

        int Largest = Integer.MIN_VALUE; // - infinity

        for(int i = 0; i<numbers.length; i++) {
            if(Largest < numbers[i]) { //if number[i] biger than largest
                Largest = numbers[i];
            }
        }
        return Largest ;
    }

    public static void main(String[] args) {
        int numbers[] = {3, 1, 3, 6, 4, 2};

        System.out.println("Largest value is : " + FindLargest(numbers));
    }
}

