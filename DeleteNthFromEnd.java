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
