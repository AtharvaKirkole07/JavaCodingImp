import java.util.LinkedList;
import java.util.Queue;
class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        // Reverse the queue using recursion
        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }

    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) return;  // Base case: if the queue is empty, stop the recursion

        // Step 1: Remove the front element
        int front = queue.remove();
        
        // Step 2: Recursively reverse the remaining queue
        reverseQueue(queue);
        
        // Step 3: Add the removed element back to the end of the queue
        queue.add(front);
    }
}
