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


    // Time com = O(1)
    // Print Linkedlist
    public void printList() {
        // when linkedlist empty
        if(head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


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


    // Remove First Node
    // Time Com = O(1)
    public int removeFirst() {
        if(size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove Last Node
    // Time Com = O(n)
    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

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


    // Reverse LL , time com = O(n) , SC = O(1)
    public void reverseLinkedlist() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }


    // Time com = O(n)  , SC = O(1)
    // Find and Remove Nth node From End
    public void deleteNthFromEnd(int n) {
        // Calc Size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // when need to delete "head" 
        if(n == size) {
            head = head.next;
            return;
        }

        // delete nth node
        int i = 1;
        int iToFind = size-n; // actual Nth prev node
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }


    // Check If LinkedList is Palindrome 
    // step-1 find Mid for even & odd LL (Slow-Fast Approch)
    public Node findMid(Node head) {
        // find mid 
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; // slow is my midNode
    }

    public boolean isPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        // step-1 = find mid
        Node midNode = findMid(head);

        // step-2 = reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head; // left half head

        // step-3 = check left half & right half
        while (right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args) {
        LinkedListCreation ll = new LinkedListCreation();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // ll.addFirst(2);
        // ll.addFirst(1);

        // ll.addLast(4);
        // ll.addLast(5);

        // ll.addInMiddile(2, 3);

        
        System.out.println("The Size of Linkedlist is : " + size);
        // 1->2->9->3->4->null
        // ll.removeFirst();
        // ll.printList();
        // System.out.println("removed value is = " + ll.removeFirst());
        
        // ll.removeLast();
        // ll.printList();
        // System.out.println(ll.removeLast());

        // System.out.println(ll.searchIterateLL(3));
        // System.out.println(ll.searchIterateLL(7));
        // ll.searchIterateLL();
        // ll.printList();
        
        // System.out.println("key at position : " + ll.recurSearch(3));
        
        // ll.reverseLinkedlist();
        // ll.printList();
        
        // ll.deleteNthFromEnd(3);
        // ll.printList();
        

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.printList(); // 1->2->2->1->null
        System.out.println("Linkedlist is " + ll.isPalindrome());
    }
}
