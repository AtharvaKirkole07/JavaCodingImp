class ReverseLinkedList {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // Printing the original linked list
        System.out.print("Original Linked List: ");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        // Reversing the linked list
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextNode = current.next; // Store the next node
            current.next = prev;               // Reverse the link
            prev = current;                    // Move prev to current
            current = nextNode;                // Move to the next node
        }

        // After the loop, prev will be the new head of the reversed list
        head = prev;

        // Printing the reversed linked list
        System.out.print("Reversed Linked List: ");
        temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
