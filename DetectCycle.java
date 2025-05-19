public class LinkedListPart2 {
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
    public static Node size;

    // Detecting Cycle in LL
    public boolean detectCycle() { // Floyd's Cycle finding algo
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if(slow == fast) {
                return true;  //cycle exist
            }
        }
        return false;  //cycle does'nt exist
    }
// call in main function
