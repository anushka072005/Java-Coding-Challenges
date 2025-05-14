public class LinkedListCreation {
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
    public static int size;

// Time com = O(1)
    // Add Last at linkedlist
    public void addLast(int data) {
        // Step-1 create newNode
        Node newNode = new Node(data);
        size++;

        // base case (when ll empty)
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step-2  tail.next -> newNode
        tail.next = newNode;

        // step-3 tail -> newNode
        tail = newNode;

    }
