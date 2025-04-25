public class FindSubSetsBackTracking {
    public static void findSubSets(String str, int i, String ans) {
        // base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        // kaam
        // Yes choice
        findSubSets(str, i+1, ans+str.charAt(i));
        // No choice
        findSubSets(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubSets(str, 0, "");
    }
}
