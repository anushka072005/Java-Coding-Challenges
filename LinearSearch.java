public class LinearSearch {

    public static int LinearSearchArray(int number[], int key) {

        for(int i = 0; i<number.length; i++) {
            if(number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6};
        int key = 3;

        int index = LinearSearchArray(numbers,key);
        if (index == -1) {
            System.out.println("Not Found");
        }
        else {
            System.out.println("key at index : " + index);
        }
    }
}
