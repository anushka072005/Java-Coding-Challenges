import java.util.*;

public class LinkedListZigZag {

    // Node class own
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // add last Own func
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print ll own func
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ZIG-ZAG function
    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftHead = head;
        Node rightHead = prev;
        Node nextL, nextR;

        // alternate merge - zig-zag merge
        while (leftHead != null && rightHead != null) {
            // zig-zag steps
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            // update steps
            leftHead = nextL;
            rightHead = nextR;

        }
    }

    public static void main(String[] args) {
        LinkedListZigZag ll = new LinkedListZigZag();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();
        ll.zigZag();
        ll.print();
    }
}
