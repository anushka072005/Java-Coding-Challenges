public class PermutationBackTracking {
    public static void permutation(String str, String ans) {
        // Base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Kaam recursion
        for(int i=0; i<str.length(); i++) {  
            char curr = str.charAt(i);  // curr"b" , "abc" remove b, a + c = ac
            String newStr = str.substring(0, i) + str.substring(i+1); // str.length-1 not imp automatically detect
            permutation(newStr, ans+curr);  //str =newStr, ans=ans+curr 
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
