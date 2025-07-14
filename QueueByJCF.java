import java.util.*;

// imp Note = Queue is a interface we can not make Interface Object by which we use LinkedList and ArrayDequeue to Implement Queue Because these are Classes we can make its Object
public class QueueByJCF {
    public static void main(String args[]) {
        // Queue<Integer> q = new LinkedList<>(); // using LL
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();            
        }
    }
}
