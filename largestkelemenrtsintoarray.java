//In this we get largest k elements and put them into new array
import java.util.*;
class klargets{
    public static void main(String[] args) {
        
        int[] arr={1,2,3,5,6,5};

        int k=6;
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> solu = new ArrayList<>();

        // Add first k elements to the priority queue
        while (i < k) {
            pq.add(arr[i]);
            i++;
        }

        // Process the rest of the array
        while (i < arr.length) {
            if (arr[i] > pq.peek()) {
                pq.poll(); // Remove the smallest element
                pq.add(arr[i]); // Add the current element
            }
            i++;
        }

        // Collect the k largest elements
        while (!pq.isEmpty()) {
            solu.add(pq.poll());
        }


        System.out.println(solu);
    }
}