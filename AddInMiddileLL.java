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

// Add Node in the Middile
    // Time Com = O(n)
    public void addInMiddile(int indx, int data) {
        // when indx = 0
        if(indx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < indx-1) {
            temp = temp.next;
            i++;
        }
        // i = indx-1;  temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

