import java.util.Arrays;

public class StringisAnagrame {

    public static boolean stringIsAnagram(String str1, String str2) {

        // Convert Strings to lowercase. Why? so thatwe don't have to checkseparately for lower & uppercase.
        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();

        // check length of string
        if (str1.length() != str2.length()){
            return false;
        }

        //converts into the tocharArray[]
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //sort the char array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        //compare to both of them
        return Arrays.equals(arr1, arr2);
    }        

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        if (stringIsAnagram(str1,str2)) {
            System.out.println(str1 + " and " + str2 + " are anagram of each other");
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram of each other");
        }

    }
}
