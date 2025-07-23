import java.util.*;
// push O(n)
public class QStackUsingTwoQueuePart2 {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty();
        }
        
        // Add O(n) 
        public static void push(int data) {
            // step 1
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            
            // step 2
            q1.add(data);

            // step 3
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // Pop O(1)
        public static int pop() {
            if(q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = q1.remove();
            return top;
        }

        // Peek O(1)
        public static int peek() {
            if(q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = q1.peek();
            return top;
        }
    }
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}