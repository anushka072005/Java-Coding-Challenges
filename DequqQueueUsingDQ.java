import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequqQueueUsingDQ {

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // Add
        public void add(int data) {
            deque.addLast(data);
        }

        // Remove
        public int remove() {
            return deque.removeFirst();
        }

        // Peek
        public int peek() {
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek ele = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
