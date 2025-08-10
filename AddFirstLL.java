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
    // Add First at linkedlist

public void addFirst(int data) {  
        // step-1  = create new Node
        Node newNode = new Node(data);
        size++;

        // let LinkedList is Empty (BaseCase)
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step-2  = newNode next -> head
        newNode.next = head; //link 

        // step-3  = newNode head
        head = newNode;

    }

// call in main function
