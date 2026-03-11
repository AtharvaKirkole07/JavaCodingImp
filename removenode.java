class Removenode {
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

        // The value to remove
        int valueToRemove = 3;

        // Check if the head node is the one to remove
        if (head != null && head.val == valueToRemove) {
            head = head.next; // Update head to the next node
        } else {
            // Traverse the list to find the node to remove
            ListNode current = head;
            while (current != null && current.next != null) {
                if (current.next.val == valueToRemove) {
                    current.next = current.next.next; // Bypass the node to be removed
                    break; // Exit the loop after removing the node
                }
                current = current.next;
            }
        }

        // Printing the modified linked list
        System.out.print("Linked List after removing " + valueToRemove + ": ");
        temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
