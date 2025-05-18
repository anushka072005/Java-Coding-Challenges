// Check If LinkedList is Palindrome 
    // step-1 find Mid for even & odd LL (Slow-Fast Approch)
    public Node findMid(Node head) {
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
