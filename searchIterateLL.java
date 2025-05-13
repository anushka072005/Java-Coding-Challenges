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
// Search key in Linkedlist(Iterative)
    // Time com = O(n)
    public int searchIterateLL(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {  //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }
