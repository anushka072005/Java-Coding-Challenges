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


    // Remove Cycle from LL
    public static void removeCycle() {
        // step-1  detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        // step-2 (find meeting point) slow = head slow -> +1, fast -> +2, last node : prev= fast
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // step-3  prev.next -> null , remove cycle
        prev.next = null; //last node

    }
    
    public static void main(String[] args) {
        LinkedListPart2 ll = new LinkedListPart2();
        /*
         head = new Node(1);
         head.next = new Node(2);
         head.next.next = new Node(3);
         // head.next.next.next = head;
 
         // 1->2->3->1
         if(ll.detectCycle()) {
             System.out.println("cycle exist");
         }
         else {
             System.out.println("cycle not exist");
         }
         // System.out.println("" + ll.detectCycle());
         */

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        
        // 1->2->3->4->2
        System.out.println(ll.detectCycle());
        ll.removeCycle();
        System.out.println(ll.detectCycle());
    }
}
