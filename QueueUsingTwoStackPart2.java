import java.util.*;

public class QueueUsingTwoStackPart2 {
    static class Queue { 
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();        
        }

        // add - O(1)
        public static void add(int data) {
            s1.push(data); // Just push to s1 directly
        }

        // remove - O(n)
        public static int remove() {
              if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // s1 -> s2  (move all to s2)
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // pop the front element (bottom of s1)
            int front = s2.pop();

            // s2 -> s1 (move everything back to s1)
            while (!s2.isEmpty()) {
                s1.push(s2.pop());                
            }

            return front;
        }

        // peek - O(n)
        public static int peek() {
              if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // s1 -> s2  (move all to s2)
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // pop the front element (bottom of s1)
            int front = s2.peek();

            // s2 -> s1 (move everything back to s1)
            while (!s2.isEmpty()) {
                s1.push(s2.pop());                
            }

            return front;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
