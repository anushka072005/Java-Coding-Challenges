import java.util.Stack;

public class StackDuplicatesParentheses {

    public static boolean isDuplicates(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if(ch == ')') {
                int count = 0;
                while (s.pop() != '(') { //directly poping not cheking peek() TOS
                    count++;
                }
                if(count < 1) {
                    return true; // Duplicates
                }
            }
            else {
                // Opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String str = "((a+b) + (c+d))"; // false
        String str = "(((a+b)) + (c+d))"; // true

        System.out.println(isDuplicates(str));
    }
}
