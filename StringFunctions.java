public class StringFunctions {
    public static void Equalfunction(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");

        if(str1 == str2) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");

        }

        if(str1 == str3) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");

        }

        if (str1.equals(str3)) {
            System.out.println("strings are equeals");
        }
        else {
            System.out.println("Strings are not equals");
        }
    }


    // STRING FUNCTION SUBSTRINGS
    public static String subString(String str, int si, int ei) {
        String substr = "";
        for(int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Hellomam";
        String show = subString(str, 5, 8);
        System.out.println(show);
    }
}
