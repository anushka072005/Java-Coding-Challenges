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

// Search key in Linkedlist(Recursive)
    // time com = O(n) , sc = O(n)
    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if(indx == -1) {
            return -1;
        }
        return indx+1;
    }
    public int recurSearch(int key) {
        return helper(head, key);
    }

