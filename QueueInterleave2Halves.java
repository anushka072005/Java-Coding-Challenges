import java.util.*;

public class QueueInterleave2Halves {
    public static void interLeaves(Queue<Integer> q) {
        Queue<Integer> firstHalfQ = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++) {
            firstHalfQ.add(q.remove());
        }
        while (!firstHalfQ.isEmpty()) {
            q.add(firstHalfQ.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        // func call
        interLeaves(q);
        // print Queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
